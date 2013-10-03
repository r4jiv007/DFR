/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * fcrui.java
 *
 * Created on 26 Dec, 2011, 4:30:53 AM
 */

package my.filecopyrem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author rajiv
 */
public class fcrui extends javax.swing.JFrame {

    public static byte flag =0;
    protected static Path ipfile=null;
    protected static Path ipdir=null;
    private static final long serialVersionUID = 1L;



    /** Creates new form fcrui */
    public fcrui() {
        initComponents();
        file.setText(null);
        folder.setText(null);
        jTextArea1.setText(null);
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        savedialog = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        file = new javax.swing.JTextField();
        folder = new javax.swing.JTextField();
        selFile = new javax.swing.JButton();
        selFolder = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton7 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Find = new javax.swing.JButton();
        FindNDel = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        fldrc.setCurrentDirectory(null);
        fldrc.setDialogTitle("Select Folder ...");
        fldrc.setFileFilter(null);
        fldrc.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);

        savedialog.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        savedialog.setFileFilter(new ExtensionFileFilter());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("File_Copy_Remover");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Inputs"));

        file.setEditable(false);

        folder.setEditable(false);

        selFile.setText("Select File");
        selFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selFileActionPerformed(evt);
            }
        });

        selFolder.setText("Select Folder");
        selFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selFolderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(selFolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selFile, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(folder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
                    .addComponent(file, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selFile)
                    .addComponent(file, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selFolder)
                    .addComponent(folder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(128, 128, 128))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTextArea1.setBackground(new java.awt.Color(1, 1, 1));
        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setForeground(new java.awt.Color(5, 166, 254));
        jTextArea1.setRows(5);
        jTextArea1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextArea1InputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
        );

        jButton7.setText("Exit");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton9.setText("Save as Log");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Clear Output");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                        .addGap(14, 14, 14))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addGap(38, 38, 38))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Find.setText("Find");
        Find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindActionPerformed(evt);
            }
        });

        FindNDel.setText("Find & Delete");
        FindNDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindNDelActionPerformed(evt);
            }
        });

        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setText("Find & Link");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FindNDel, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(Find, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Find)
                .addGap(32, 32, 32)
                .addComponent(FindNDel)
                .addGap(29, 29, 29)
                .addComponent(jButton5)
                .addGap(29, 29, 29)
                .addComponent(jButton6)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(857, Short.MAX_VALUE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    private void FindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindActionPerformed


            if(file.getText().equals("") || folder.getText().equals(""))
            {
                 JOptionPane.showMessageDialog(this,"Select a file and folder first!!","DFR",JOptionPane.INFORMATION_MESSAGE);
            }
             else
            {   
                ipfile = null;
                ipdir=null;
                jTextArea1.setText("");
                 ipfile = Paths.get(file.getText().toString());
                 ipdir =Paths.get(folder.getText().toString()) ;
                Linker.display(ipfile.toString(),ipdir.toString());
                ipfile = null;
                ipdir=null;
                flag=0;
                Linker.rslt=false;// TODO add your handling code here:
            }
    }//GEN-LAST:event_FindActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if((JOptionPane.showConfirmDialog(this, "Are You sure", "DFR", JOptionPane.OK_CANCEL_OPTION) ==JOptionPane.OK_OPTION)){
             System.exit(0);
        }    
               // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void FindNDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindNDelActionPerformed

            if(file.getText().equals("") || folder.getText().equals(""))
            {
                 JOptionPane.showMessageDialog(this,"Select a file and folder first!!","DFR",JOptionPane.INFORMATION_MESSAGE);
            }
             else
            {
                flag = 1;
                ipfile = null;
                ipdir=null;
                jTextArea1.setText("");
                 ipfile = Paths.get(file.getText());
                 ipdir =Paths.get(folder.getText()) ;
                Linker.display(ipfile.toString(),ipdir.toString());
                ipfile = null;
                ipdir=null;
            flag=0;// TODO add your handling code here:
            Linker.rslt=false;
            }
    }//GEN-LAST:event_FindNDelActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed


            if(file.getText().equals("") || folder.getText().equals(""))
            {
                 JOptionPane.showMessageDialog(this,"Select a file and folder first!!","DFR",JOptionPane.INFORMATION_MESSAGE);
            }
             else
            {
                flag = 2;
                ipfile = null;
                ipdir=null;
                jTextArea1.setText("");
                ipfile = Paths.get(file.getText());
                ipdir =Paths.get(folder.getText()) ;
                Linker.display(ipfile.toString(),ipdir.toString());
                ipfile = null;
                ipdir=null;
                flag=0;// TODO add your handling code here:
                Linker.rslt=false;
            }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
                    file.setText("")  ;
                     folder.setText("")  ;
                      jTextArea1.setText("")  ;
                      ipfile = null;
                        ipdir=null;
                        flag=0;// TODO add your handling code here:
                        Linker.rslt=false;
    }//GEN-LAST:event_jButton6ActionPerformed

    private void selFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selFileActionPerformed


        final JFileChooser fc = new JFileChooser();


            int returnVal = fc.showOpenDialog(this);
            fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
            if (returnVal== JFileChooser.APPROVE_OPTION)
            {
                file.setText(fc.getSelectedFile().toString());

            }




    }//GEN-LAST:event_selFileActionPerformed

private void selFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selFolderActionPerformed

              if(file.getText().equals(""))
            {
                 JOptionPane.showMessageDialog(this,"Select a file first!!","DFR",JOptionPane.INFORMATION_MESSAGE);
            }
             else
            {
                    int returnVal = fldrc.showOpenDialog(this);
                    fldrc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                    fldrc.setFileFilter(null);
                    fldrc.setAcceptAllFileFilterUsed(false);
                    if (returnVal== JFileChooser.APPROVE_OPTION)
                    {
                        folder.setText(fldrc.getSelectedFile().toString());

                    }
            }

}//GEN-LAST:event_selFolderActionPerformed

private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
                jTextArea1.setText("")  ;
                      ipfile = null;
                        ipdir=null;
                        flag=0;// TODO add your handling code here:
                        Linker.rslt=false;                // TODO add your handling code here:
}//GEN-LAST:event_jButton10ActionPerformed

private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

    if(!(jTextArea1.getText().equals("") ))
    {
                       // final JFileChooser savedialog=new JFileChooser();
                        //FileFilter filter = new FileNameExtensionFilter("LOG file", "log");
                        int returnval =savedialog.showSaveDialog(this);
                        String filename;
                       // savedialog.addChoosableFileFilter(filter);
                        if(returnval == JFileChooser.APPROVE_OPTION)
                        {   filename=filter(savedialog.getSelectedFile().toString());
                            File tosave =new File(filename);
                            FileWriter fstream;
            try {
                fstream = new FileWriter(tosave);
                BufferedWriter out = new BufferedWriter(fstream);

                //while(jTextArea1.read)
                out.write(jTextArea1.getText());
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(fcrui.class.getName()).log(Level.SEVERE, null, ex);
            }

                        }
    }

    else
    {
        JOptionPane.showMessageDialog(this,"Nothing To Save","Log",JOptionPane.INFORMATION_MESSAGE);
    }
}//GEN-LAST:event_jButton9ActionPerformed

private void jTextArea1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextArea1InputMethodTextChanged
            //   jButton9.enable(true); // TODO add your handling code here:
}//GEN-LAST:event_jTextArea1InputMethodTextChanged

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fcrui().setVisible(true);
            }
        });
    }


  private String filter(String fname)
  {
      if(fname.endsWith(".log"))
      {
          return fname;
      }
      else {
            return fname.concat(".log");
        }

  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Find;
    private javax.swing.JButton FindNDel;
    private javax.swing.JTextField file;
    private static final javax.swing.JFileChooser fldrc = new javax.swing.JFileChooser();
    private javax.swing.JTextField folder;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextArea jTextArea1;
    private javax.swing.JFileChooser savedialog;
    private javax.swing.JButton selFile;
    private javax.swing.JButton selFolder;
    // End of variables declaration//GEN-END:variables

}