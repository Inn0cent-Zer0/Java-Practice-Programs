import java.awt.*;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stiudentfile extends Frame {
    TextField RegisterNumber, Name, Marks;
    Button Enter, Done;
    Label RegLab, NameLabel, MarkLabel;
    DataOutputStream dos;

    public Stiudentfile() {
        super("Create a student file");
    }

    public static void main(String[] args) {
        Stiudentfile student = new Stiudentfile();
        student.setup();
    }

    public void setup() {
        resize(400, 200);
        setLayout(new GridLayout(4, 2));
        RegisterNumber = new TextField(25);
        RegLab = new Label("Roll Number");
        Name = new TextField(25);
        NameLabel = new Label("Student Name");
        Marks = new TextField(25);
        MarkLabel = new Label("Total Marks");
        Enter = new Button("Enter");
        Done = new Button("Done");
        add(RegLab);
        add(RegisterNumber);
        add(NameLabel);
        add(Name);
        add(MarkLabel);
        add(Marks);
        add(Enter);
        add(Done);
        show();
        try {
            dos = new DataOutputStream(new FileOutputStream("student.dat"));
        } catch (IOException e) {
            System.out.println(e);
            System.exit(1);
        }
    }

    public void addRecord() {
        int num;
        Double d;
        num = Integer.valueOf(RegisterNumber.getText());
        try {
            dos.writeInt(RegisterNumber);
            dos.writeUTF(Name.getText());
            d = new Double(Marks.getText());
            dos.writeDouble(d.doubleValue());
        } catch (IOException e) {

        }
        RegisterNumber.setText(" ");
        Name.setText(" ");
        Marks.setText(" ");

    }

    public void cleanup() {
        if (!RegisterNumber.getText().equals(" ")) {
            addRecord();
        }
        try {
            dos.flush();
            dos.close();
        } catch (IOException e) {
        }
    }

    public boolean action(Event event, object o) {
        if (event.teg instanceof Button) {
            if (event.arg.equals("ENTER")) {
                addRecord();
                return true;
            }
        }
        return super.action(event, object o);
        public boolean handleEvent (Event event)
        {
            if (event.get instanceof Button) {
                if (event.arg.equals("Done")) {
                    cleanup();
                    System.exit(0);
                    return true;
                }
            }
            return super.handleEvent(event);
        }

    }
}