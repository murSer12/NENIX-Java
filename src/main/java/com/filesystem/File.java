package com.filesystem;

public class File {
    private int address;
    private String fileName;

    private int allFile = 0;
    private File[] blockMatrix;
    private int maxFiles;

    
    public File(int maxFiles) {
        this.maxFiles = maxFiles;
        blockMatrix = new File[maxFiles];
    }

    // Method to create a file
    public int createFile(final String fileName) {
        if (allFile < maxFiles) {
            File newFile = new File(0);
            newFile.address = allFile;
            newFile.fileName = fileName;
            blockMatrix[allFile] = newFile;
            ++allFile;
            System.out.println("\nFile created!\n");
        } else {
            System.out.println("\nToo many files! Please delete some files!\n");
            return 1;
        }
        return 0;
    }

    public int deleteFile(final String fileName) {
        if (allFile != 0) {
            boolean fileFound = false;
            for (int i = 0; i < allFile; i++) {
                if (blockMatrix[i] != null && blockMatrix[i].fileName.equals(fileName)) {
                    System.out.println("\nDeleting file: " + blockMatrix[i].fileName);
                    blockMatrix[i] = null;
                    fileFound = true;
                    allFile--;
                    break;
                }
            }
            if (!fileFound) {
                System.out.println("\nFile not found!\n");
                return 1;
            }
        } else {
            System.out.println("\nNo files to delete!\n");
            return 1;
        }
        return 0;
    }

    public int ls() {
        System.out.println("\nListing Files:");
        if (allFile == 0) {
            System.out.println("No files available.");
            return 1;
        }

        for (int i = 0; i < maxFiles; i++) {
            if (blockMatrix[i] != null) {
                System.out.println(i + ": " + blockMatrix[i].fileName);
            }
        }
        return 0;
    }
}
