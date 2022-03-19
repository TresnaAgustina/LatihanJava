import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ToDoListTest {
    public static void main(String[] args) throws IOException {
        String list,menu;

        InputStreamReader todo = new InputStreamReader(System.in);
        BufferedReader todolist = new BufferedReader(todo);

        System.out.print("Tambahkan Kegiatan?[y/n]: ");
        menu = todolist.readLine();

        switch (menu){
            case "y":
//                insertList();
                break;

            case "n":
                System.out.println();
                break;

            default:
                System.out.println();
                break;
        }
    }

//    static void insertList()
}

