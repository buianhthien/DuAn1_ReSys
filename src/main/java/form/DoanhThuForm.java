/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package form;

import com.ReSys.dao.HoaDonDAO;
import com.ReSys.dao.ThongKeDAO;
import com.ReSys.utis.DinhDang;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HI
 */
public class DoanhThuForm extends javax.swing.JPanel {

    /**
     * Creates new form DoanhThuForm
     */
    public DoanhThuForm() {
        initComponents();
        setOpaque(false);
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblNam = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblThang = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblNgay = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        lblTitle1.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(15, 69, 197));
        lblTitle1.setText("Doanh thu");

        tblNam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Năm", "Số lượt khách", "Hóa đơn thấp nhất", "Hóa đơn cao nhất", "Hóa đơn trung bình", "Doanh thu"
            }
        ));
        tblNam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNamMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblNam);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("Theo Năm", jPanel1);

        tblThang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Tháng", "Số lượt khách", "Hóa đơn thấp nhất", "Hóa đơn cao nhất", "Hóa đơn trung bình", "Doanh thu"
            }
        ));
        tblThang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblThangMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblThang);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("Theo Tháng", jPanel2);

        tblNgay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Ngày", "Số lượt khách", "Hóa đơn thấp nhất", "Hóa đơn cao nhất", "Hóa đơn trung bình", "Doanh thu"
            }
        ));
        jScrollPane5.setViewportView(tblNgay);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE))
        );

        tabs.addTab("Theo Ngày", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tabs)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblThangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblThangMouseClicked
        // TODO add your handling code here:
        this.rowThang = tblThang.getSelectedRow();
        tabs.setSelectedIndex(2);
        fillTableDoanhThuTheoNgay();
    }//GEN-LAST:event_tblThangMouseClicked

    private void tblNamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNamMouseClicked
        // TODO add your handling code here:
        this.rowNam = tblNam.getSelectedRow();
        tabs.setSelectedIndex(1);
        fillTableDoanhThuTheoThang();
    }//GEN-LAST:event_tblNamMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblNam;
    private javax.swing.JTable tblNgay;
    private javax.swing.JTable tblThang;
    // End of variables declaration//GEN-END:variables
    HoaDonDAO hddao = new HoaDonDAO();
    ThongKeDAO tkdao = new ThongKeDAO();
    int rowNam = -1;
    int rowThang = -1;
    int nam = 0, thang = 0;

    void init() {
        fillTableDoanhThuTheoNam();
    }
    
    //Thống kê tổng hợp theo ngày
    void fillTableDoanhThuTheoNgay() {
        DefaultTableModel model = (DefaultTableModel) tblNgay.getModel();
        model.setRowCount(0);
        thang = (int) tblThang.getValueAt(rowThang, 0);
        if (nam != 0 && thang != 0) {
            List<Object[]> list = tkdao.getThongKeDoanhThuTheoNgay(nam, thang);
            for (Object[] row : list) {
                for (int i = 2; i <= 5; i++) {
                row[i] = DinhDang.formatCurrency((Double) row[i]);
                }
                model.addRow(row);
            }
        }
    }
    
    // Thống kê tổng hợp theo tháng
    void fillTableDoanhThuTheoThang() {
        DefaultTableModel model = (DefaultTableModel) tblThang.getModel();
        model.setRowCount(0);
        nam = (int) tblNam.getValueAt(rowNam, 0);
        if (nam != 0) {
            List<Object[]> list = tkdao.getThongKeDoanhThuTheoThang(nam);
            for (Object[] row : list) {
                for (int i = 2; i <= 5; i++) {
                row[i] = DinhDang.formatCurrency((Double) row[i]);
                }
                model.addRow(row);
            }
        }
    }
    
    // Thống kê tổng hợp theo năm
    void fillTableDoanhThuTheoNam() {
        DefaultTableModel model = (DefaultTableModel) tblNam.getModel();
        model.setRowCount(0);
        List<Object[]> list = tkdao.getThongKeDoanhThuTheoNam();
        for (Object[] row : list) {
            for (int i = 2; i <= 5; i++) {
                row[i] = DinhDang.formatCurrency((Double) row[i]);
            }
            model.addRow(row);
        }
    }
}
