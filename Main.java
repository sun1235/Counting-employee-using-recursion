import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {

        Scanner input = new Scanner(System.in);

        Linkedlist name = new Linkedlist();

        FileReader fr = new FileReader("/home/gravitational/Documents/Project3/src/employee.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        int position = 0;
        String buffer = " ";
        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);
            while (st.hasMoreTokens()) {
                if (position == 0)
                    {
                        String tokenEmployee = st.nextToken();
                        buffer = tokenEmployee;
                        position++;
                    }
                else
                {
                    String tokenEmployee = st.nextToken();
                    name.insert(tokenEmployee);
                    name.insert(buffer);
                    position = 0;
                }
            }
        }

        System.out.print("Please enter the department you want to look for: "  );
        String department = input.nextLine();
        System.out.println();
        name.print(department);
        System.out.println();
        name.Sort();
    }
}
