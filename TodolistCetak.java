import java.io.BufferedReader;
import java.io.InputStreamReader;


public class TodolistCetak extends Todolist{

    
    
     public static void main (String [] args) throws Exception {
        
        String my_user,my_password;
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
  

             Todolist user1 = new Todolist() {};
             System.out.println("============ LOGIN ==============");
             System.out.print("Masukkan username = "); my_user = br.readLine();
             System.out.print("Masukkan password = "); my_password = br.readLine();

             if (my_user.equals(user1.getUsername()) && my_password.equals(user1.getPassword())) {
                 System.out.println(todo2);
                 System.out.println(" Login Berhasil ");
                 System.out.println(todo2);
             } else {
                 System.out.println(todo2);
                 System.out.println(" Login Gagal ");
                 System.out.println(todo2);
                 do {
                     System.out.println("============ LOGIN ==============");
                     System.out.print("Masukan username = "); my_user = br.readLine();
                     System.out.print("Masukan password = "); my_password = br.readLine();
                 } while (!my_user.equals(user1.getUsername()) || !my_password.equals(user1.getPassword()));
             }

               
        
        
        
            Todolist todolistObj = new Todolist();
                    __loop:
                    while (true) {
                        switch (pilihMenu()) {
                            case '1':
                               todolistObj.tambah_list();
                                break;
                            case '2':
                                todolistObj.tampilkan_list();
                                break;
                            case '3':
                                todolistObj.hapus_list();
                                break;
                            case '4':
                                todolistObj.edit_list();
                                break;
                            case '5':
                                todolistObj.tandai_selesai();
                                break;
                            default :
                                break __loop;
                        }
                    }

                    kbd.close();

                }

                static int pilihMenu() {
                    char[] menuDaftarKey = {
                        '1', '2', '3', '4', '5', '0'
                    };
                    String[] menuDaftarTxt = {
                        "Tambah To Do List", 
                        "Tampilkan Semua To Do List",
                        "Hapus To Do List",
                        "Edit To Do List",
                        "Tandai Selesai",
                        "Selesai",
                    };

                    String pilihanKeyMenu = "";

                        System.out.println("\n");
                        System.out.println(todo2);
                        System.out.println("TO DO LIST");
                        System.out.println(todo2);


                     for(int i = 0; i < menuDaftarTxt.length ; i++) {
            //             switch (menuDaftarKey[i]) {
            //                 case'2':
            //                 case'3':
            //                     if (currentList.size()<= 0)
            //                         continue;
            //             }
                        pilihanKeyMenu += " " + menuDaftarKey[i];
                            System.out.println(menuDaftarKey[i] + " . " + menuDaftarTxt[i]);
                     }
                     System.out.println();
                     while(true) {
                         int idxOf ;

                         System.out.print(
                         "pilih("  + 
                          pilihanKeyMenu. substring(1). replace(" ", "/") +
                                 "):"

                         );
                    idxOf = pilihanKeyMenu.indexOf((kbd.nextLine().trim() + "-").charAt(0));
                    if (idxOf >=0)
                        return pilihanKeyMenu.charAt(idxOf);
                     }

}
    
    
    
    
    
}
