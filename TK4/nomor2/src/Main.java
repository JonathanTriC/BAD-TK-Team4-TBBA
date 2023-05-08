import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Main extends JFrame {
    static final String DB_URL = "jdbc:mysql://localhost:3306/TK4?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private String finalName;
    private Integer finalNim;
    private Float finalAvg;
    private String finalGrade;
    private String finalDesc;
    private JLabel jLabelNama;
    private JLabel jLabelFinalNama;
    private JLabel jLabelValueNama;
    private JLabel jLabelNim;
    private JLabel jLabelFinalNim;
    private JLabel jLabelValueNim;
    private JLabel jLabelNTugas;
    private JLabel jLabelNKuis;
    private JLabel jLabelNUTS;
    private JLabel jLabelNUAS;
    private JLabel jLabelFinalRerata;
    private JLabel jLabelValueRerata;
    private JLabel jLabelFinalGrade;
    private JLabel jLabelValueGrade;
    private JLabel jLabelFinalKeterangan;
    private JLabel jLabelValueKeterangan;
    private JButton btnHitung;
    private JButton btnReset;
    private JButton btnSimpan;
    private JTextField namaTF;
    private JTextField nimTF;
    private JTextField nTugasTF;
    private JTextField nKuisTF;
    private JTextField nUTSTF;
    private JTextField nUASTF;
    public Main() {
        initComponents();
    }

    private void initComponents() {
        setTitle("TK4");
        jLabelNama = new JLabel();
        jLabelFinalNama = new JLabel();
        jLabelValueNama = new JLabel();
        jLabelNim = new JLabel();
        jLabelFinalNim = new JLabel();
        jLabelValueNim = new JLabel();
        jLabelNTugas = new JLabel();
        jLabelNKuis = new JLabel();
        jLabelNUTS = new JLabel();
        jLabelNUAS = new JLabel();
        jLabelFinalRerata = new JLabel();
        jLabelValueRerata = new JLabel();
        jLabelFinalGrade = new JLabel();
        jLabelValueGrade = new JLabel();
        jLabelFinalKeterangan = new JLabel();
        jLabelValueKeterangan = new JLabel();
        namaTF = new JTextField();
        nimTF = new JTextField();
        nTugasTF = new JTextField();
        nKuisTF = new JTextField();
        nUTSTF = new JTextField();
        nUASTF = new JTextField();
        btnHitung = new JButton();
        btnReset = new JButton();
        btnSimpan = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jLabelNama.setText("Nama");
        jLabelFinalNama.setText("Nama");
        jLabelValueNama.setText(":");
        jLabelFinalNim.setText("Nim");
        jLabelValueNim.setText(":");
        jLabelFinalRerata.setText("Rerata");
        jLabelValueRerata.setText(":");
        jLabelFinalGrade.setText("Grade");
        jLabelValueGrade.setText(":");
        jLabelFinalKeterangan.setText("Keterangan");
        jLabelValueKeterangan.setText(":");
        jLabelNim.setText("NIM");
        jLabelNTugas.setText("Nilai Tugas");
        jLabelNKuis.setText("Nilai Kuis");
        jLabelNUTS.setText("Nilai UTS");
        jLabelNUAS.setText("Nilai UAS");

        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnHitungActionPerformed(e);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnResetActionPerformed(e);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnSimpanActionPerformed(e);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup()
                                        .addGroup(layout.createParallelGroup()
                                                .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(jLabelNama, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(namaTF, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                                )
                                                .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(jLabelNim, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(nimTF, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                                )
                                                .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(jLabelNTugas, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(nTugasTF, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                                )
                                                .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(jLabelNKuis, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(nKuisTF, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                                )
                                                .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(jLabelNUTS, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(nUTSTF, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                                )
                                                .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(jLabelNUAS, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(nUASTF, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                                )
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(btnHitung, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnReset, GroupLayout.PREFERRED_SIZE,100,GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnSimpan, GroupLayout.PREFERRED_SIZE,100,GroupLayout.PREFERRED_SIZE)
                                                )
                                        )
                                )
                                .addGroup(layout.createParallelGroup()
                                        .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabelFinalNama, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabelValueNama, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        )
                                        .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabelFinalNim, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabelValueNim, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        )
                                        .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabelFinalRerata, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabelValueRerata, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        )
                                        .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabelFinalGrade, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabelValueGrade, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        )
                                        .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabelFinalKeterangan, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabelValueKeterangan, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                        )
                                )
                        )
        );
        layout.setVerticalGroup(
                layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelNama, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(namaTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                )
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelNim, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nimTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                )
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelNTugas, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nTugasTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                )
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelNKuis, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nKuisTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                )
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelNUTS, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nUTSTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                )
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelNUAS, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nUASTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                )
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                        .addComponent(btnHitung, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnReset, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSimpan, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                )
                        )
                        .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelFinalNama, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelValueNama, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                )
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelFinalNim, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelValueNim, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                )
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelFinalRerata, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelValueRerata, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                )
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelFinalGrade, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelValueGrade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                )
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelFinalKeterangan, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelValueKeterangan, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                )
                        )
        );

        pack();
    }

    private float calcuteAverage() {
        int tugas = Integer.parseInt(nTugasTF.getText());
        int kuis = Integer.parseInt(nKuisTF.getText());
        int uts = Integer.parseInt(nUTSTF.getText());
        int uas = Integer.parseInt(nUASTF.getText());
        float total = tugas+kuis+uts+uas;
        return total/4;
    }

    private String calculateGrade() {
        String grade = "";
        float avg = calcuteAverage();

        if (avg >= 85.0) {
            grade = "A";
        } else if (avg >= 70.0 && avg <= 84.0) {
            grade = "B";
        } else {
            grade = "C";
        }

        return grade;
    }

    private String calculateKeterangan() {
        String ket = "";
        String grade = calculateGrade();

        if (grade == "C") {
            ket = "Dinyatakan Tidak Lulus";
        } else {
            ket = "Dinyatakan Lulus";
        }

        return ket;
    }

    private void resetForm() {
        namaTF.setText("");
        nimTF.setText("");
        nTugasTF.setText("");
        nKuisTF.setText("");
        nUTSTF.setText("");
        nUASTF.setText("");
        jLabelValueNama.setText(":");
        jLabelValueNim.setText(":");
        jLabelValueRerata.setText(":");
        jLabelValueGrade.setText(":");
        jLabelValueKeterangan.setText(":");
    }

    private int generateId() {
        int min = 100;
        int max = 999;

        int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);

        return random_int;
    }
    private void btnHitungActionPerformed(ActionEvent e) {
        System.out.println("Nama: " + namaTF.getText());
        System.out.println("NIM: " + nimTF.getText());
        System.out.println("Nilai Tugas: " + nTugasTF.getText());
        System.out.println("Nilai Kuis: " + nKuisTF.getText());
        System.out.println("Nilai UTS: " + nUTSTF.getText());
        System.out.println("Nilai UAS: " + nUASTF.getText());
        System.out.println("Rerata: " + calcuteAverage());
        System.out.println("Grade: " + calculateGrade());
        System.out.println("Keterangan: " + calculateKeterangan());
        finalName = namaTF.getText();
        jLabelValueNama.setText(": " + namaTF.getText());
        finalNim = Integer.parseInt(nimTF.getText());
        jLabelValueNim.setText(": " + nimTF.getText());
        finalAvg = calcuteAverage();
        jLabelValueRerata.setText(": " + String.valueOf(calcuteAverage()));
        finalGrade = calculateGrade();
        jLabelValueGrade.setText(": " + calculateGrade());
        finalDesc = calculateKeterangan();
        jLabelValueKeterangan.setText(": " + calculateKeterangan());
    }

    private void btnResetActionPerformed(ActionEvent e) {
        resetForm();
    }

    private void btnSimpanActionPerformed(ActionEvent e) {
        try(Connection conn = DriverManager.getConnection(DB_URL, "root", "");
            Statement stmt = conn.createStatement();
        ) {
            System.out.println("Inserting records into the table...");
            String sql = "INSERT INTO STUDENTS VALUES (" + generateId() + ","  + "\"" + finalName + "\"" + "," + finalNim + "," + finalAvg + "," + "\"" + finalGrade + "\"" + "," + "\"" + finalDesc + "\"" + ")";
            System.out.println(sql);
            stmt.executeUpdate(sql);

            resetForm();
            JOptionPane.showMessageDialog(null, "Berhasil simpan");
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public static void main(String args[]) {
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, "root", "");
            Statement stmt = conn.createStatement();

            String insertDB = "CREATE TABLE STUDENTS " +
                    "(id INTEGER not NULL, " +
                    " name VARCHAR(255), " +
                    " nim INTEGER, " +
                    " average FLOAT, " +
                    " grade VARCHAR(255), " +
                    " description VARCHAR(255), " +
                    " PRIMARY KEY ( id ))";
            stmt.executeUpdate(insertDB);
            System.out.println("Create Table...");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
}