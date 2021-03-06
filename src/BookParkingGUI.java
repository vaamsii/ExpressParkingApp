
import java.util.Random;

import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vamsilingamaneni
 */
public class BookParkingGUI extends javax.swing.JFrame {

	/**
	 * Creates new form bookParking
	 */
	public BookParkingGUI() {
		initComponents();
		this.setLocationRelativeTo(null);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jButtonBookParking = new javax.swing.JButton();
		jButtonback = new javax.swing.JButton();
		jLabelLicensePlate = new javax.swing.JLabel();
		jLabelParkingSpot = new javax.swing.JLabel();
		jLabelValidPayment = new javax.swing.JLabel();
		jTextFieldLicense1 = new javax.swing.JTextField();
		jLabelDuration = new javax.swing.JLabel();
		jTextFieldDuration = new javax.swing.JTextField();
		jComboBoxParkingSpot = new javax.swing.JComboBox<>();
		jPanel2 = new javax.swing.JPanel();
		jButtonLogout = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(89, 98, 117));

		jButtonBookParking.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jButtonBookParking.setText("Book Parking");
		jButtonBookParking.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		jButtonBookParking.addMouseListener(new java.awt.event.MouseAdapter() {

		});
		jButtonBookParking.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButtonBookParkingActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jButtonback.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jButtonback.setText("Back");
		jButtonback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		jButtonback.addMouseListener(new java.awt.event.MouseAdapter() {

		});
		jButtonback.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonbackActionPerformed(evt);
			}
		});

		jLabelLicensePlate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabelLicensePlate.setForeground(new java.awt.Color(255, 255, 255));
		jLabelLicensePlate.setText("License Plate:");

		jLabelParkingSpot.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabelParkingSpot.setForeground(new java.awt.Color(255, 255, 255));
		jLabelParkingSpot.setText("Parking spot:");

		jLabelValidPayment.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabelValidPayment.setForeground(new java.awt.Color(255, 255, 255));

		jTextFieldLicense1.setBackground(new java.awt.Color(108, 122, 137));
		jTextFieldLicense1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		jTextFieldLicense1.setForeground(new java.awt.Color(255, 255, 255));
		jTextFieldLicense1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldLicense1ActionPerformed(evt);
			}
		});

		jLabelDuration.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabelDuration.setForeground(new java.awt.Color(255, 255, 255));
		jLabelDuration.setText("Duration(mins):");

		jTextFieldDuration.setBackground(new java.awt.Color(108, 122, 137));
		jTextFieldDuration.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		jTextFieldDuration.setForeground(new java.awt.Color(255, 255, 255));
		jTextFieldDuration.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldDurationActionPerformed(evt);
			}
		});

		jComboBoxParkingSpot.setBackground(new java.awt.Color(108, 122, 137));
		jComboBoxParkingSpot.setModel(new javax.swing.DefaultComboBoxModel<>(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));
		jComboBoxParkingSpot.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBoxParkingSpotActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(127, 127, 127)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jLabelParkingSpot, javax.swing.GroupLayout.PREFERRED_SIZE, 89,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabelLicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, 89,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(jPanel1Layout
												.createSequentialGroup().addComponent(jLabelDuration).addGap(9, 9, 9)))
								.addGap(18, 18, 18)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jTextFieldLicense1, javax.swing.GroupLayout.PREFERRED_SIZE, 134,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addComponent(jTextFieldDuration,
														javax.swing.GroupLayout.PREFERRED_SIZE, 134,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jLabelValidPayment))
										.addComponent(jComboBoxParkingSpot, javax.swing.GroupLayout.PREFERRED_SIZE, 134,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(75, 75, 75)
								.addComponent(jButtonBookParking, javax.swing.GroupLayout.PREFERRED_SIZE, 157,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18).addComponent(jButtonback, javax.swing.GroupLayout.PREFERRED_SIZE,
										157, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(69, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(39, 39, 39)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabelLicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, 18,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextFieldLicense1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(13, 13, 13)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabelParkingSpot, javax.swing.GroupLayout.PREFERRED_SIZE, 18,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jComboBoxParkingSpot))
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(15, 15, 15)
										.addComponent(jLabelValidPayment))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jTextFieldDuration,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabelDuration))))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButtonBookParking, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButtonback, javax.swing.GroupLayout.PREFERRED_SIZE, 52,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(21, 21, 21)));

		jPanel2.setBackground(new java.awt.Color(245, 205, 121));

		jButtonLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jButtonLogout.setText("Logout");
		jButtonLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		jButtonLogout.addMouseListener(new java.awt.event.MouseAdapter() {

		});
		jButtonLogout.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButtonLogoutActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(50, 50, 50));
		jLabel1.setText("Book Parking");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel2Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jButtonLogout).addContainerGap())
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(152, 152, 152).addComponent(jLabel1)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(jButtonLogout)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel1)
						.addGap(0, 20, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(87, 87, 87).addComponent(jPanel1,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>

	private void jButtonBookParkingActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		// TODO add your handling code here:
		String path = "database.csv";
		MaintainDatabase maintain = new MaintainDatabase();
		String email = MaintainUser.emailString;
		int parkingSpot = Integer.parseInt(jComboBoxParkingSpot.getSelectedItem().toString());
		String license = jTextFieldLicense1.getText();
		int duration = Integer.parseInt(jTextFieldDuration.getText());
		Random rand = new Random();
		int bookID = rand.nextInt(7500);

		maintain.load(path);
		for (Database d : maintain.databaseList) {
			if (maintain.unique(parkingSpot)) {
				jLabel1.setText("Parking lot already booked");
			} else {
				Database newUser = new Database(email, parkingSpot, license, duration, false, bookID, false,"0");
				maintain.databaseList.add(newUser);

				maintain.update(path);

				jLabel1.setText("Booked the lot for: " + email);
			}
		}

	}

	private void jButtonbackActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		CustomerGUI cGUI = new CustomerGUI();
		cGUI.setVisible(true);
		cGUI.pack();
		cGUI.setLocationRelativeTo(null);
		cGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.dispose();
	}

	private void jTextFieldLicense1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		// TODO add your handling code here:
    	String path = "user.csv";
    	MaintainUser main = new MaintainUser();
    	 MaintainUser.logout(MaintainUser.emailString);
         main.update(path);
		LandingGUI OP = new LandingGUI();
		OP.setVisible(true);
		OP.pack();
		OP.setLocationRelativeTo(null);
		OP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.dispose();
	}

	private void jTextFieldDurationActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jComboBoxParkingSpotActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(BookParkingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(BookParkingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(BookParkingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(BookParkingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new BookParkingGUI().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton jButtonBookParking;
	private javax.swing.JButton jButtonLogout;
	private javax.swing.JButton jButtonback;
	private javax.swing.JComboBox<String> jComboBoxParkingSpot;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabelDuration;
	private javax.swing.JLabel jLabelLicensePlate;
	private javax.swing.JLabel jLabelParkingSpot;
	private javax.swing.JLabel jLabelValidPayment;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JTextField jTextFieldDuration;
	private javax.swing.JTextField jTextFieldLicense1;
	// End of variables declaration
}
