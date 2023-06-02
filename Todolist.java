import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Todolist extends LoginAbs implements Tambah, Tampil, Hapus, Edit, Tandai {
    static Scanner input;
    static Scanner kbd = new Scanner(System.in);
    static List<String> currentList = new ArrayList<>();
    static String todo1 = "------------------------------";
    static String todo2 = "==============================";
    
    @Override
    public void tambah_list() {
        String item ;
        System.out.println("\nMENAMBAH TO DO LIST");
        System.out.println(todo1);
        System.out.println("(Baris kosong = selesai)");
        while (true) {
            System.out.print(currentList.size() + 1);
            System.out.print(".");
            item = kbd.nextLine();
            if(item.trim().isEmpty())
                return;
            
            currentList.add(item);
        }
    }

    @Override
    public void tampilkan_list() {
        int number = 0;
        
        System.out.println("\nDAFTAR SEMUA TUGAS");
        System.out.println(todo1);
        for(String item : currentList) {
            System.out.println(++number + "." + item);
        }
        System.out.println(todo1);
    }

    @Override
    public void hapus_list() {
        int idx;
        int idxMax = currentList.size();
        String klmt = "/0=batal";
        
        System.out.println("\nMENGHAPUS TUGAS");
        System.out.println(todo1);
        System.out.println("Nomor tugas yang ingin dihapus (1");
        if (idxMax > 1)
            klmt = "..." + idxMax + klmt;
        
        System.out.println(klmt);
        idx = kbd.nextInt(); kbd.nextLine();
        if (1 <= idx && idx <= idxMax)
            currentList.remove(idx-1);
        System.out.println(todo1);
    }

    @Override
    public void edit_list() {
        int idx;
        int idxMax = currentList.size();
        String klmt = "/0=batal";
    
        System.out.println("\nMENGEDIT TUGAS");
        System.out.println(todo1);
        System.out.println("Nomor tugas yang ingin diedit (1");
        if (idxMax > 1)
            klmt = "..." + idxMax + klmt;
    
        System.out.println(klmt);
        idx = kbd.nextInt(); kbd.nextLine();
        if (1 <= idx && idx <= idxMax) {
            System.out.println("Masukkan tugas baru: ");
        String newItem = kbd.nextLine();
        currentList.set(idx-1, newItem);
        System.out.println("Tugas berhasil diubah.");
    }
    else {
        System.out.println("Nomor tugas tidak valid.");
    }
    System.out.println(todo1);
    }
    
    @Override
        public void tandai_selesai() {
        int idx;
        int idxMax = currentList.size();
        String klmt = "/0=batal";

        System.out.println("\nTANDAI TUGAS SELESAI");
        System.out.println(todo1);
        System.out.println("Nomor tugas yang ingin ditandai selesai (1");
        if (idxMax > 1)
            klmt = "..." + idxMax + klmt;

        System.out.println(klmt);
        idx = kbd.nextInt();
        kbd.nextLine();
        if (1 <= idx && idx <= idxMax) {
            String task = currentList.get(idx - 1);
            currentList.set(idx - 1, task + "[X] ");
            System.out.println("Tugas '" + task + "' telah ditandai selesai.");
        } else {
            System.out.println("Nomor tugas tidak valid.");
        }
        System.out.println(todo1);
    }
    
    
   @Override
    public void setUsername(String username) {
       this.username = username;
    }

    @Override
    public void setPassword(String password) {
       this.password = password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
      return password;
    }
    
    private String username, password;
      public Todolist() {
            username = "user";
            password = "123";
      }
    
    
  
    
}
