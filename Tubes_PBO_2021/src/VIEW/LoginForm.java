package VIEW;

import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginForm extends JFrame {

    public LoginForm() {
        initComponents();
    }

    public void loginError(String u, String p) {
        if ("".equals(u) && "".equals(p)) {
            JOptionPane.showMessageDialog(null, "Silahkan isi Username dan Password", "Login Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Username atau Password Salah", "Login Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomePanel = new javax.swing.JPanel();
        appsLabel = new javax.swing.JLabel();
        welcomeLabel = new javax.swing.JLabel();
        loginPanel = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        passwordText = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setName("LoginFrame"); // NOI18N
        setResizable(false);

        appsLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        appsLabel.setForeground(new java.awt.Color(0, 204, 102));
        appsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appsLabel.setText("Management Inventory Toko");
        appsLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        welcomeLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(0, 204, 102));
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("Selamat Datang");

        javax.swing.GroupLayout welcomePanelLayout = new javax.swing.GroupLayout(welcomePanel);
        welcomePanel.setLayout(welcomePanelLayout);
        welcomePanelLayout.setHorizontalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(appsLabel)
                    .addGroup(welcomePanelLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(welcomeLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        welcomePanelLayout.setVerticalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, welcomePanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(welcomeLabel)
                .addGap(6, 6, 6)
                .addComponent(appsLabel)
                .addGap(6, 6, 6))
        );

        usernameLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 16)); // NOI18N
        usernameLabel.setText("Username");

        passwordLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 16)); // NOI18N
        passwordLabel.setText("Password");

        usernameText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usernameText.setToolTipText("Your Username");
        usernameText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        usernameText.setOpaque(false);

        passwordText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordText.setToolTipText("Your Password");
        passwordText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        passwordText.setOpaque(false);

        loginButton.setBackground(new java.awt.Color(0, 204, 102));
        loginButton.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");

        clearButton.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        clearButton.setText("Clear");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameLabel)
                    .addComponent(passwordLabel))
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addComponent(clearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginButton))
                    .addComponent(usernameText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(passwordText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(clearButton))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(welcomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(loginPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(welcomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void addButtonListener (ActionListener buttonlistener) {
        loginButton.addActionListener(buttonlistener);
        clearButton.addActionListener(buttonlistener);
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appsLabel;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameText;
    private javax.swing.JLabel welcomeLabel;
    private javax.swing.JPanel welcomePanel;
    // End of variables declaration//GEN-END:variables

    public void clearFields() {
       getUsernameText().setText("");
       getPasswordText().setText("");
    }
    
    public JLabel getAppsLabel() {
        return appsLabel;
    }

    public void setAppsLabel(JLabel appsLabel) {
        this.appsLabel = appsLabel;
    }

    public JButton getClearButton() {
        return clearButton;
    }

    public void setClearButton(JButton clearButton) {
        this.clearButton = clearButton;
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(JButton loginButton) {
        this.loginButton = loginButton;
    }

    public JPanel getLoginPanel() {
        return loginPanel;
    }

    public void setLoginPanel(JPanel loginPanel) {
        this.loginPanel = loginPanel;
    }

    public JLabel getPasswordLabel() {
        return passwordLabel;
    }

    public void setPasswordLabel(JLabel passwordLabel) {
        this.passwordLabel = passwordLabel;
    }

    public JPasswordField getPasswordText() {
        return passwordText;
    }

    public void setPasswordText(JPasswordField passwordText) {
        this.passwordText = passwordText;
    }

    public JLabel getUsernameLabel() {
        return usernameLabel;
    }

    public void setUsernameLabel(JLabel usernameLabel) {
        this.usernameLabel = usernameLabel;
    }

    public JTextField getUsernameText() {
        return usernameText;
    }

    public void setUsernameText(JTextField usernameText) {
        this.usernameText = usernameText;
    }

    public JLabel getWelcomeLabel() {
        return welcomeLabel;
    }

    public void setWelcomeLabel(JLabel welcomeLabel) {
        this.welcomeLabel = welcomeLabel;
    }

    public JPanel getWelcomePanel() {
        return welcomePanel;
    }

    public void setWelcomePanel(JPanel welcomePanel) {
        this.welcomePanel = welcomePanel;
    }
    
}
