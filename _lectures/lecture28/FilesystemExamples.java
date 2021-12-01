import tester.*;
import java.util.List;
import java.util.NoSuchElementException;
 
interface FolderContent {
  boolean containsFile(String name);
  String getContents(String name);
}
 
class File implements FolderContent {
  String name;
  String contents;
  File(String name, String contents) {
    this.name = name;
    this.contents = contents;
  }
  public boolean containsFile(String name) {
    return this.name.equals(name);
  }
  public String getContents(String name) {
    if(this.name.equals(name)) { return this.contents; }
    else { throw new NoSuchElementException(); }
  }
}

class Folder1 implements FolderContent {
  String name;
  List<FolderContent> contents;
  Folder1(String name, List<FolderContent> contents){ 
    this.name = name;
    this.contents = contents;
  }
  public String getContents(String name) {
    for(FolderContent fc: this.contents) {
                                         // this call could be recursive
      if(fc.containsFile(name)) { return fc.getContents(name); }
    }
    throw new NoSuchElementException();
  }
  public boolean containsFile(String name) {
    for(FolderContent fc: this.contents) {
      if(fc.containsFile(name)) {
        return true;
      }
    }
    return false;
  }
 
}
 
class Folder2 {
  String name;
  List<File> files; 
  List<Folder2> folders;
  Folder2(String name, List<File> files, List<Folder2> folders) {
    this.name = name;
    this.files = files;
    this.folders = folders;
  }

  public boolean containsFile(String name) {
    for(File f: this.files) {
      if(f.containsFile(name)) { return true; }
    }
    for(Folder2 f: this.folders) {
      if(f.containsFile(name)) { return true; }
    }
    return false;
  }
  


  public String largestFile() {
    int largest = 0;
    String largestName = "";
    System.out.println("Looking at: " + this.name);
    for(File f: this.files) {
      System.out.println("Considering file: " + f.name);
      if(f.contents.length() > largest) {
        largest = f.contents.length();
        largestName = f.name;
      }
    }
    for(Folder2 f: this.folders) {
      String largestInFolder = f.largestFile();
      System.out.println(largest + " " + largestName + " " + largestInFolder);
      // Use getcontents instead of largestInFolder.length()
      if(largestInFolder.length() > largest) {
        largest = largestInFolder.length();
        largestName = largestInFolder;
      }
      System.out.println(largest + " " + largestName);
    }
    System.out.println("Done with " + this.name);
    return largestName;
  }



}

class FilesystemExamples {
  Folder1 dictionaries = new Folder1("dictionaries", List.of());
  Folder1 poems = new Folder1("poems", List.of(new File("haiku.txt", "a haiku")));
  Folder1 textfiles = new Folder1(
    "textfiles",
    List.of(dictionaries, poems, new File("words.txt", "hello\ngoodbye\na\ncat")));
  Folder1 lecture28f1 = new Folder1(
    "28-lecture",
    List.of(new File("FilesystemExamples.java", "<java code>"), textfiles)
  );
 
  void testContainsFile(Tester t){
    t.checkExpect(lecture28f1.containsFile("haiku.txt"), true);
    t.checkExpect(lecture28f1.containsFile("notthere.txt"), false);
    t.checkExpect(dictionaries.containsFile("haiku.txt"), false);
    t.checkExpect(textfiles.containsFile("FilesystemExamples.java"), false);
  }

  void testGetContents(Tester t){
    t.checkExpect(lecture28f1.getContents("haiku.txt"), "a haiku");
    t.checkException(new NoSuchElementException(), lecture28f1, "getContents", "notthere.txt");
  }
 
  Folder2 dictionaries2 = new Folder2("dictionaries", List.of(), List.of());
  Folder2 poems2 = new Folder2(
      "poems",
      List.of(new File("haiku.txt", "a haiku")),
      List.of());
 
  Folder2 textfiles2 = new Folder2(
    "textfiles",
    List.of( new File("words.txt", "hello\ngoodbye\na\ncat")),
    List.of(dictionaries2, poems2)
  );
  Folder2 lecture28f2 = new Folder2(
    "28-lecture",
    List.of(new File("f.java", "<java code>")),
    List.of(textfiles2)
  );

  void testLargestFile(Tester t) {
    t.checkExpect(lecture28f2.largestFile(), "words.txt");
    t.checkExpect(poems2.largestFile(), "haiku.txt");
  }

}
