    import java.io.*;
    import java.util.*;

    class Employee {
        int empId;
        String name;
        float basic;

        void getData(Scanner sc) {
            System.out.print("Enter Employee ID: ");
            empId = sc.nextInt();
            sc.nextLine(); // clear buffer

            System.out.print("Enter Name: ");
            name = sc.nextLine();

            System.out.print("Enter Basic Salary: ");
            basic = sc.nextFloat();

            if (basic < 0) {
                System.out.println("Invalid salary! Setting to 0.");
                basic = 0;
            }
        }

        void display() {
            System.out.println("\nEmployee ID: " + empId);
            System.out.println("Name: " + name);
            System.out.println("Basic Salary: " + basic);
        }
    }

    class Payroll extends Employee {
        float hra, da, pf, gross, net;

        String filePath = "employees.csv";

        void calculateSalary() {
            hra = basic * 0.20f;
            da = basic * 0.10f;
            pf = basic * 0.05f;

            gross = basic + hra + da;
            net = gross - pf;
        }

        void printSlip() {
            System.out.println("\n===== PAY SLIP =====");
            display();
            System.out.printf("HRA (20%%)   : %.2f\n", hra);
            System.out.printf("DA (10%%)    : %.2f\n", da);
            System.out.printf("PF (5%%)     : %.2f\n", pf);
            System.out.printf("Gross Salary: %.2f\n", gross);
            System.out.printf("Net Salary  : %.2f\n", net);
            System.out.println("====================\n");
        }

        void writeToFile() {
            try {
                File file = new File(filePath);
                boolean fileExists = file.exists();

                BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));

                if (!fileExists) {
                    bw.write("EmpID,Name,Basic,HRA,DA,PF,Gross,Net\n");
                }

                bw.write(empId + "," + name + "," + basic + "," + hra + "," + da + "," + pf + "," + gross + "," + net + "\n");
                bw.close();

            } catch (IOException e) {
                System.out.println("Error writing file!");
            }
        }

        void deleteEmployee(Scanner sc) {
            System.out.print("\nEnter employee ID to delete: ");
            String deleteId = sc.next();

            File inputFile = new File(filePath);
            File tempFile = new File("temp.csv");

            boolean isDeleted = false;

            try {
                BufferedReader br = new BufferedReader(new FileReader(inputFile));
                BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile));

                String line;
                boolean isFirst = true;

                while ((line = br.readLine()) != null) {
                    if (isFirst) {
                        bw.write(line + "\n"); // keep header
                        isFirst = false;
                        continue;
                    }

                    String[] parts = line.split(",");

                    if (parts[0].equals(deleteId)) {
                        isDeleted = true;
                        continue;
                    }

                    bw.write(line + "\n");
                }

                br.close();
                bw.close();

                inputFile.delete();
                tempFile.renameTo(inputFile);

                if (isDeleted)
                    System.out.println("\nEmployee Removed Successfully!");
                else
                    System.out.println("\nEmployee ID Not Found!");

            } catch (IOException e) {
                System.out.println("Error!");
            }
        }

        void updateEmployee(Scanner sc) {
            System.out.print("\nEnter Employee ID to update: ");
            String updateId = sc.next();

            File inputFile = new File(filePath);
            File tempFile = new File("temp.csv");

            boolean found = false;

            try {
                BufferedReader br = new BufferedReader(new FileReader(inputFile));
                BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile));

                String line;
                boolean isFirst = true;

                while ((line = br.readLine()) != null) {
                    if (isFirst) {
                        bw.write(line + "\n"); // keep header
                        isFirst = false;
                        continue;
                    }

                    String[] parts = line.split(",");

                    if (parts[0].equals(updateId)) {
                        found = true;

                        sc.nextLine(); // clear buffer

                        System.out.print("Enter New Name: ");
                        name = sc.nextLine();

                        System.out.print("Enter New Basic Salary: ");
                        basic = sc.nextFloat();

                        calculateSalary();

                        bw.write(updateId + "," + name + "," + basic + "," + hra + "," + da + "," + pf + "," + gross + "," + net + "\n");
                    } else {
                        bw.write(line + "\n");
                    }
                }

                br.close();
                bw.close();

                inputFile.delete();
                tempFile.renameTo(inputFile);

                if (found)
                    System.out.println("\nEmployee updated successfully!");
                else
                    System.out.println("\nEmployee ID not found!");

            } catch (IOException e) {
                System.out.println("Error!");
            }
        }

        void searchEmployee(Scanner sc) {
            System.out.print("\nEnter Employee ID to search: ");
            String searchId = sc.next();

            boolean found = false;

            try {
                BufferedReader br = new BufferedReader(new FileReader(filePath));
                String line;
                boolean isFirst = true;

                while ((line = br.readLine()) != null) {
                    if (isFirst) {
                        isFirst = false;
                        continue;
                    }

                    String[] parts = line.split(",");

                    if (parts[0].equals(searchId)) {
                        found = true;

                        System.out.println("\n===== Employee Found =====");
                        System.out.println("Employee ID : " + parts[0]);
                        System.out.println("Name        : " + parts[1]);
                        System.out.println("Basic Salary: " + parts[2]);
                        System.out.println("HRA         : " + parts[3]);
                        System.out.println("DA          : " + parts[4]);
                        System.out.println("PF          : " + parts[5]);
                        System.out.println("Gross Salary: " + parts[6]);
                        System.out.println("Net Salary  : " + parts[7]);
                        System.out.println("==========================\n");

                        break;
                    }
                }

                br.close();

            } catch (IOException e) {
                System.out.println("Error!");
            }

            if (!found) {
                System.out.println("\nEmployee ID not found!");
            }
        }

        void displayAll() {
            File file = new File(filePath);

            if (!file.exists()) {
                System.out.println("\nNo employee records found!");
                return;
            }

            try {
                BufferedReader br = new BufferedReader(new FileReader(filePath));
                String line;

                System.out.println("\n--- Employee Records ---");

                while ((line = br.readLine()) != null) {
                    String[] parts = line.split(",");

                    for (String val : parts) {
                        System.out.printf("%-12s", val);
                    }
                    System.out.println();
                }

                br.close();

            } catch (IOException e) {
                System.out.println("Error!");
            }
        }
    }

    public class Main {
        public static void main(String[] args) {

            Payroll emp = new Payroll();
            Scanner sc = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n===== PAYROLL MANAGEMENT SYSTEM =====");
                System.out.println("1. Add Employee");
                System.out.println("2. Delete Employee");
                System.out.println("3. Update Employee");
                System.out.println("4. Search Employee");
                System.out.println("5. Display All Employees");
                System.out.println("6. Exit");
                System.out.print("Enter choice: ");

                choice = sc.nextInt();
                sc.nextLine(); 
                switch (choice) {
                    case 1:
                        emp.getData(sc);
                        emp.calculateSalary();
                        emp.printSlip();
                        emp.writeToFile();
                        break;

                    case 2:
                        emp.deleteEmployee(sc);
                        break;

                    case 3:
                        emp.updateEmployee(sc);
                        break;

                    case 4:
                        emp.searchEmployee(sc);
                        break;

                    case 5:
                        emp.displayAll();
                        break;

                    case 6:
                        System.out.println("Thank you!");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

            } while (choice != 6);

            sc.close();
        }
    }