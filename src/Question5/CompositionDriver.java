package question5;

public class CompositionDriver {

    public static void main(String[] args) {

        // Main folder
        Folder phpDemo = new Folder("php_demo1");

        // Main subfolders
        Folder sourceFiles = new Folder("Source Files");
        Folder includePath = new Folder("Include Path");
        Folder remoteFiles = new Folder("Remote Files");

        // Folders inside Source Files
        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("public");

        // Folders inside app
        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder("models");
        Folder views = new Folder("views");

        // Add folders to app
        app.addSubFolder(config);
        app.addSubFolder(controllers);
        app.addSubFolder(library);
        app.addSubFolder(migrations);
        app.addSubFolder(models);
        app.addSubFolder(views);

        // Add files to public
        publicFolder.addFile(new File(".htaccess"));
        publicFolder.addFile(new File(".htrouter.php"));
        publicFolder.addFile(new File("index.html"));

        // Add folders to Source Files
        sourceFiles.addSubFolder(phalcon);
        sourceFiles.addSubFolder(app);
        sourceFiles.addSubFolder(cache);
        sourceFiles.addSubFolder(publicFolder);

        // Add main subfolders to php_demo1
        phpDemo.addSubFolder(sourceFiles);
        phpDemo.addSubFolder(includePath);
        phpDemo.addSubFolder(remoteFiles);

        // STEP 1 - Print original structure
        System.out.println("ORIGINAL FILE STRUCTURE");
        System.out.println("=======================");
        phpDemo.print();

        // STEP 2 - Delete app
        phpDemo.deleteSubFolder("app");

        System.out.println();
        System.out.println("AFTER DELETING APP");
        System.out.println("==================");
        phpDemo.print();

        // STEP 3 - Delete public
        phpDemo.deleteSubFolder("public");

        System.out.println();
        System.out.println("AFTER DELETING PUBLIC");
        System.out.println("=====================");
        phpDemo.print();
    }
}