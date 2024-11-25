import os
import shutil

def createNewApp(appName, packageName, path):
    # split package name using '.'
    package = packageName.split('.')
    camelCaseAppName = appName[0].lower() + appName[1:]

    # read all folders recursively under boilerplate folder and change names $p0 to package[0], $p1 to package[1] and $p2 to package[2]
    # and copy them to the path
    for root, dirs, files in os.walk('../boilerplate'):
        for dir in dirs:
            # Create the directory structure in the target path
            new_dir = os.path.join(path, os.path.relpath(os.path.join(root, dir), '../boilerplate'))
            os.makedirs(new_dir, exist_ok=True)
        
        for file in files:
            # print file path 
            print(os.path.join(root, file))
            if file.endswith('.jar') or file.endswith('.DS_Store'):
                continue  # Skip .jar and .DS_Store files
            with open(os.path.join(root, file), 'r', encoding='utf-8') as f:
                content = f.read()
                content = content.replace('$camelCaseAppName', camelCaseAppName)
                content = content.replace('$appName', appName)
                content = content.replace('$packageName', packageName)
                
                # Ensure the target directory exists
                target_dir = os.path.join(path, os.path.relpath(root, '../boilerplate'))

                for i in range(3):
                    target_dir = target_dir.replace('$p'+str(i), package[i])

                os.makedirs(target_dir, exist_ok=True)
                
                file = file.replace('$appName', appName)
                with open(os.path.join(target_dir, file), 'w', encoding='utf-8') as f:
                    f.write(content)

    # delete $p0 folder recursively from target directory
    shutil.rmtree(os.path.join(path, 'androidApp/src/main/java/$p0'))
    shutil.rmtree(os.path.join(path, 'shared/src/androidMain/kotlin/$p0'))
    shutil.rmtree(os.path.join(path, 'shared/src/commonMain/kotlin/$p0'))
    shutil.rmtree(os.path.join(path, 'shared/src/commonMain/sqldelight/$p0'))
    shutil.rmtree(os.path.join(path, 'shared/src/iosMain/kotlin/$p0'))

def __main__():
    # get app name
    appName = ""

    # appname must be PascalCase. Check appname is PascalCase
    while not appName.isidentifier() or not appName[0].isupper():
        print("App name must be PascalCase")
        appName = input("Enter app name: ")

    # get package name
    packageName = ""

    # check if package name made of three words ask again otherwise
    while len(packageName.split('.')) != 3:
        print("Package name must include at 3 words separated by '.'")
        packageName = input("Enter package name ( eg. com.example.appname ): ")

    # get path
    path = input("Enter path: ")
    
    # create new app
    createNewApp(appName, packageName, path)

__main__()