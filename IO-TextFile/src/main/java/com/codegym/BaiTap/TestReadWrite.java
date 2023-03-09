package com.codegym.BaiTap;



import java.util.List;

public class TestReadWrite {
    public static int countCharactor(List<String> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            count += list.get(i).length();
        }
        return count;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<String> list = readAndWriteFile.readFile("C:\\CodeGym\\Module-2\\IO-TextFile\\file.txt");
        list.add(String.valueOf(countCharactor(list)));
        readAndWriteFile.writeFile("C:\\CodeGym\\Module-2\\IO-TextFile\\numbers.txt",list);
    }
}
