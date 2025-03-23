
package main;

//import form.DanhSachMon;
import com.ReSys.utis.Auth;
import com.ReSys.utis.MsgBox;
import form.MainForm;
import form.ChangePassForm;
import form.DanhMucForm;
import form.DanhSachBanForm;
import form.DatBanForm;
import form.DoanhThuForm;
import form.HoaDonForm;
import form.HomePage;
import form.MonAnFrom;
import form.NhanVienForm;
import form.SoLuongMon;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import menu.EventMenuSelected;
import menu.EventShowPopupMenu;
import menu.MenuItem;
import menu.PopupMenu;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import swing.Header;
import swing.Menu;

/**
 *
 * @author HI
 */
public class Main extends javax.swing.JFrame {
    private MigLayout layout;
    private Menu menu;
    private Header header;
    private MainForm main;
    private Animator animator;
    
    public Main() {
        setTitle("ReSys");
        initComponents();
         ihi();
         init();
         setAlwaysOnTop(true);
         this.setLocationRelativeTo(null);
    }
     private boolean OpenQuanLiNhanVien() {
            if (!Auth.isManager()) {
                MsgBox.alert(this, "Bạn không có quyền xem và chỉnh sửa nhân viên");
                return false;
            } else {
                return true;
            }
       
    }
      private boolean OpenThongKe() {
            if (!Auth.isManager()) {
                MsgBox.alert(this, "Bạn không có quyền xem thống kê");
                return false;
            } else {
                return true;
            }
       
    }

    private void ihi(){
        new Chao(this, true).setVisible(true);
        new Hi(this, true).setVisible(true);
    }
    private void init(){
        layout = new MigLayout("fill", "0[]0[100%, fill]0", "0[fill, top]0");
        bg.setLayout(layout);
        menu = new Menu();
        header = new Header();
        main = new MainForm();
        
        menu.addEvent(new EventMenuSelected() {
            @Override
            public void menuSelected(int menuIndex, int subMenuIndex) {
                if(menuIndex==0){
                    if(subMenuIndex==0){
                       main.showForm(new DanhMucForm());
                    }else if(subMenuIndex==1){
                       main.showForm(new MonAnFrom());
                    }
                }else if(menuIndex==1){
                    if(subMenuIndex==0){
                        main.showForm(new DanhSachBanForm());
                    }else if(subMenuIndex==1){
                        main.showForm(new DatBanForm());
                    }else if(subMenuIndex==2){
                        main.showForm(new HoaDonForm());
                    }
                    
                }else if(menuIndex==2){
                    if(subMenuIndex==0){
                        if(OpenThongKe()){
                        main.showForm(new DoanhThuForm());
                        }
                    }else if(subMenuIndex==1){
                        if(OpenThongKe()){
                        main.showForm(new SoLuongMon());
                        }
                    }
                }else if(menuIndex==3){
                    if(subMenuIndex==0){
                        main.showForm(new HomePage());
                    }else if(subMenuIndex==1){
                        if(OpenQuanLiNhanVien()){
                        main.showForm(new NhanVienForm());
                        }
                    }else if(subMenuIndex==2){
                        main.showForm(new ChangePassForm());
                    }else if(subMenuIndex==3){  
                        setVisible(false); 
                        new Chao(Main.this, true).setVisible(true);
                        setVisible(true);
                        main.showForm(new HomePage());
                    }else if(subMenuIndex==4){
                        System.exit(0);
                    }
                }
            }
        });
        menu.addEventShow(new EventShowPopupMenu() {
            @Override
            public void showPopup(Component com) {
                MenuItem item = (MenuItem) com;
                PopupMenu popup = new PopupMenu(Main.this, item.getIndex(), item.getEventSelected(), item.getMenu().getSubMenu());
                int x = Main.this.getX()+52;
                int y = Main.this.getY()+com.getY()+87;
                popup.setLocation(x, y);
                popup.setVisible(true);
            }
        });
        menu.initMenuItem();
        bg.add(menu, "w 230!, spany 2");   
        bg.add(header, "h 50!, wrap");
        bg.add(main, "w 100%, h 100%");
        TimingTarget target = new TimingTargetAdapter(){
            @Override
            public void timingEvent(float fraction) {
                double width;
                if(menu.isShowMenu()){
                    width = 60+(170*(1f-fraction));
                }else{
                    width = 60+(170*fraction);
                }
                layout.setComponentConstraints(menu, "w "+ width+ "!, spany2");
                menu.revalidate();
            }

            @Override
            public void end() {
                menu.setShowMenu(!menu.isShowMenu());
                menu.setEnableMenu(true);
            }
            
        };
        animator = new Animator(500,target);
        animator.setResolution(0);
        animator.setDeceleration(0.5f);
        animator.setAcceleration(0.5f);
        header.addMenuEvent(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!animator.isRunning()){
                    animator.start();
                }
                menu.setEnableMenu(false);
                if(menu.isShowMenu()){
                    menu.hideallMenu();
                }
            }
        });
        main.showForm(new HomePage());
    }
    @SuppressWarnings("unchecked") 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(204, 255, 255));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setOpaque(true);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1092, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane bg;
    // End of variables declaration//GEN-END:variables
}
