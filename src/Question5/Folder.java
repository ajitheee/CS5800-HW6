package question5;

import java.util.ArrayList;

public class Folder {

    private String name;
    private ArrayList<File> files;
    private ArrayList<Folder> subFolders;

    public Folder(String name) {
        this.name = name;
        this.files = new ArrayList<>();
        this.subFolders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public ArrayList<Folder> getSubFolders() {
        return subFolders;
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void addSubFolder(Folder folder) {
        subFolders.add(folder);
    }

    public void deleteSubFolder(String folderName) {

        subFolders.removeIf(
                folder -> folder.getName().equals(folderName)
        );

        for (Folder folder : subFolders) {
            folder.deleteSubFolder(folderName);
        }
    }

    public void print() {
        print("");
    }

    private void print(String indent) {

        System.out.println(indent + "+ " + name);

        String childIndent = indent + "   ";

        for (File file : files) {
            file.print(childIndent);
        }

        for (Folder folder : subFolders) {
            folder.print(childIndent);
        }
    }
}