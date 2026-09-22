package week2;

public class Students {
    

    private String studentID;
    private String Name;
    private String major;

    // Constructor
    public Students(String studentID, String Name, String major) {
        this.studentID = studentID;
        this.Name = Name;
        this.major = major;
    }

    public static void main(String[] args) {
        Students student01 = new Students("68xxx", "Thanawat", "Computer Science");
        
        System.out.println(student01.getFullname("Thanawat", "Traipidok"));
        System.out.println("---------------------------------------");

        // --- ส่วนทดสอบฟังก์ชันหาเกรดใหม่ ---
        // เคสที่ 1: คะแนน 92 (92 / 2 = 46 เป็นเลขคู่) -> เกณฑ์คือ >= 90 ดังนั้นได้ A
        System.out.println("คะแนน 92 : " + student01.getCustomGrade(92f)); 

        // เคสที่ 2: คะแนน 86 (86 / 2 = 43 เป็นเลขคี่) -> เกณฑ์คือ >= 80 ดังนั้นได้ A
        System.out.println("คะแนน 86 : " + student01.getCustomGrade(86f)); 

        // เคสที่ 3: คะแนน 82 (82 / 2 = 41 เป็นเลขคี่) -> เกณฑ์คือ >= 80 ดังนั้นได้ A
        System.out.println("คะแนน 82 : " + student01.getCustomGrade(82f)); 

        // เคสที่ 4: คะแนน 88 (88 / 2 = 44 เป็นเลขคู่) -> เกณฑ์คือ >= 90 ดังนั้นชวด A (ได้ F)
        System.out.println("คะแนน 88 : " + student01.getCustomGrade(88f)); 
    }

    // ฟังก์ชันเดิมของคุณ
    public String profile(String student) {
        return "this is student id : " + studentID;
    }

    public String getFullname(String fname, String lname) {
        return "this fullname is : " + fname + " " + lname;
    }

    // ✨ ฟังก์ชันหาเกรดตามเงื่อนไขใหม่ที่สั่ง
    public String getCustomGrade(Float point) {
        // 1. นำเลขคะแนนมาหารสอง (แปลงเป็น int เพื่อให้เช็กคู่/คี่ได้ง่าย)
        int resultAfterDivide = (int) (point / 2);
        String grade = "F"; // ตั้งต้นให้เป็น F ไว้ก่อน ถ้าไม่เข้าเงื่อนไข A

        // 2. เช็กว่าเป็นเลขคู่ หรือ เลขคี่
        if (resultAfterDivide % 2 == 0) {
            // ถ้าระหว่างทางเป็น "เลขคู่" -> ต้องได้คะแนน >= 90 ถึงจะได้ A
            if (point >= 90) {
                grade = "A";
            }
        } else {
            // ถ้าระหว่างทางเป็น "เลขคี่" -> ต้องได้คะแนน >= 80 ถึงจะได้ A
            if (point >= 80) {
                grade = "A";
            }
        }

        return "Result after divide 2 is " + resultAfterDivide + " -> Grade is : " + grade;
    }  
}