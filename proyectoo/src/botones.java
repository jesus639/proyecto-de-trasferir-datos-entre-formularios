
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class botones extends javax.swing.JFrame {

    int contarClics = 0;
    int puntoss = 0;
    int sumapares = 0;
    int sumaimpares = 0;
    java.util.ArrayList<Integer> numerosSeleccionados = new java.util.ArrayList<>();

    public botones() {

        initComponents();
        this.setLocationRelativeTo(this);
        niveles.setText(DatosCompartidos.nivel);

        int[][] matrizNumeros = new int[6][6];
        JButton[][] botones = {
            {Boton1, Boton2, Boton3, Boton4, Boton5, Boton6},
            {Boton7, Boton8, Boton9, Boton10, Boton11, Boton12},
            {Boton13, Boton14, Boton15, Boton16, Boton17, Boton18},
            {Boton19, Boton20, Boton21, Boton22, Boton23, Boton24},
            {Boton25, Boton26, Boton27, Boton28, Boton29, Boton30},
            {Boton31, Boton32, Boton33, Boton34, Boton35, Boton36}
        };
        Random rand = new Random();
        ImageIcon imagen = new ImageIcon(getClass().getResource("/imagen/logooo.png"));

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matrizNumeros[i][j] = rand.nextInt(100);
                botones[i][j].setIcon(imagen);
                botones[i][j].setText("");
                botones[i][j].setActionCommand(String.valueOf(matrizNumeros[i][j]));
                botones[i][j].setPreferredSize(new Dimension(90, 60));
                

                final JButton boton = botones[i][j];
                boton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        contarClics++;
                        intentos.setText(String.valueOf(contarClics));
                        int numero = 0;
                        if (DatosCompartidos.nivel.equals("Nivel 1")) {
                            numero = rand.nextInt(36) + 1;
                        } else if (DatosCompartidos.nivel.equals("Nivel 2")) {
                            numero = rand.nextInt(100) + 1;
                        } else if (DatosCompartidos.nivel.equals("Nivel 3")) {
                            numero = rand.nextInt(1000) + 1;
                        }
                        
                        numerosSeleccionados.add(numero);
                        puntoss += numero;
                        if (numero % 2 == 0) {
                            sumapares += numero;
                            pares.setText(String.valueOf(sumapares));
                        } else {
                            sumaimpares += numero;
                            impares.setText(String.valueOf(sumaimpares));

                        }

                        puntos.setText(String.valueOf(puntoss));
                        boton.setIcon(null);
                        boton.setText(String.valueOf(numero));

                        new javax.swing.Timer(2000, new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent evt) {
                                boton.setText("");
                                boton.setIcon(imagen);
                            }
                        }) {
                            {
                                setRepeats(false);
                                start();
                            }
                        };
                    }
                });
            }
        }
        reorganizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                intentos.setText("0");
                puntos.setText("0");
                pares.setText("0");
                impares.setText("0");
                contarClics = 0;
                sumapares = 0;
                sumaimpares = 0;
                puntoss = 0;
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Boton3 = new javax.swing.JButton();
        Boton15 = new javax.swing.JButton();
        Boton9 = new javax.swing.JButton();
        Boton4 = new javax.swing.JButton();
        Boton16 = new javax.swing.JButton();
        Boton10 = new javax.swing.JButton();
        Boton28 = new javax.swing.JButton();
        Boton21 = new javax.swing.JButton();
        Boton33 = new javax.swing.JButton();
        Boton27 = new javax.swing.JButton();
        Boton22 = new javax.swing.JButton();
        Boton34 = new javax.swing.JButton();
        Boton12 = new javax.swing.JButton();
        Boton30 = new javax.swing.JButton();
        Boton23 = new javax.swing.JButton();
        Boton35 = new javax.swing.JButton();
        Boton29 = new javax.swing.JButton();
        Boton24 = new javax.swing.JButton();
        Boton5 = new javax.swing.JButton();
        Boton36 = new javax.swing.JButton();
        Boton17 = new javax.swing.JButton();
        Boton11 = new javax.swing.JButton();
        Boton6 = new javax.swing.JButton();
        Boton18 = new javax.swing.JButton();
        Boton25 = new javax.swing.JButton();
        Boton20 = new javax.swing.JButton();
        Boton1 = new javax.swing.JButton();
        Boton32 = new javax.swing.JButton();
        Boton13 = new javax.swing.JButton();
        Boton7 = new javax.swing.JButton();
        Boton2 = new javax.swing.JButton();
        Boton8 = new javax.swing.JButton();
        Boton14 = new javax.swing.JButton();
        Boton26 = new javax.swing.JButton();
        Boton19 = new javax.swing.JButton();
        Boton31 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        puntos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        intentos = new javax.swing.JTextField();
        jButton37 = new javax.swing.JButton();
        impares = new javax.swing.JTextField();
        pares = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        reorganizar = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        niveles = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Boton3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logooo.png"))); // NOI18N
        getContentPane().add(Boton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, 60));

        Boton15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logooo.png"))); // NOI18N
        Boton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton15ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, 60));

        Boton9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logooo.png"))); // NOI18N
        Boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton9ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, 60));

        Boton4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logooo.png"))); // NOI18N
        getContentPane().add(Boton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, 60));

        Boton16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logooo.png"))); // NOI18N
        Boton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton16ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, 60));

        Boton10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logooo.png"))); // NOI18N
        getContentPane().add(Boton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, 60));

        Boton28.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logooo.png"))); // NOI18N
        getContentPane().add(Boton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, -1, 60));

        Boton21.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logooo.png"))); // NOI18N
        getContentPane().add(Boton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, 60));

        Boton33.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logooo.png"))); // NOI18N
        Boton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton33ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, -1, 60));

        Boton27.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logooo.png"))); // NOI18N
        getContentPane().add(Boton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, -1, 60));

        Boton22.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logooo.png"))); // NOI18N
        getContentPane().add(Boton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, 60));

        Boton34.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logooo.png"))); // NOI18N
        Boton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton34ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, -1, 60));

        Boton12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logooo.png"))); // NOI18N
        getContentPane().add(Boton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, -1, 60));

        Boton30.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logooo.png"))); // NOI18N
        Boton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton30ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, -1, 60));

        Boton23.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logooo.png"))); // NOI18N
        getContentPane().add(Boton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, -1, 60));

        Boton35.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logooo.png"))); // NOI18N
        Boton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton35ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, -1, 60));

        Boton29.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logooo.png"))); // NOI18N
        getContentPane().add(Boton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, -1, 60));

        Boton24.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logooo.png"))); // NOI18N
        Boton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton24ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, -1, 60));

        Boton5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logooo.png"))); // NOI18N
        getContentPane().add(Boton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, -1, 60));

        Boton36.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logooo.png"))); // NOI18N
        Boton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton36ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, -1, 60));

        Boton17.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logooo.png"))); // NOI18N
        Boton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton17ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, 60));

        Boton11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logooo.png"))); // NOI18N
        getContentPane().add(Boton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, -1, 60));

        Boton6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logooo.png"))); // NOI18N
        getContentPane().add(Boton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, -1, 60));

        Boton18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logooo.png"))); // NOI18N
        Boton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton18ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, -1, 60));

        Boton25.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logooo.png"))); // NOI18N
        getContentPane().add(Boton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, 60));

        Boton20.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logooo.png"))); // NOI18N
        Boton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton20ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, 60));

        Boton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logooo.png"))); // NOI18N
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 60));

        Boton32.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logooo.png"))); // NOI18N
        Boton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton32ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, -1, 60));

        Boton13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logooo.png"))); // NOI18N
        Boton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton13ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 60));

        Boton7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logooo.png"))); // NOI18N
        getContentPane().add(Boton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 60));

        Boton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logooo.png"))); // NOI18N
        getContentPane().add(Boton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, 60));

        Boton8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logooo.png"))); // NOI18N
        getContentPane().add(Boton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, 60));

        Boton14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logooo.png"))); // NOI18N
        Boton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton14ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, 60));

        Boton26.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logooo.png"))); // NOI18N
        getContentPane().add(Boton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, 60));

        Boton19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logooo.png"))); // NOI18N
        getContentPane().add(Boton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, 60));

        Boton31.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Boton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logooo.png"))); // NOI18N
        Boton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton31ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, 60));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setText("PUNTOS:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, -1, -1));

        puntos.setText("0");
        getContentPane().add(puntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 97, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setText("INTENTOS:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, -1, -1));

        intentos.setText("0");
        getContentPane().add(intentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 470, 90, -1));

        jButton37.setBackground(new java.awt.Color(51, 51, 255));
        jButton37.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton37.setText("Acerca de");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 560, 150, -1));

        impares.setText("0");
        getContentPane().add(impares, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 100, -1));

        pares.setText("0");
        getContentPane().add(pares, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, 90, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setText("SUMA  IMPARES:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, -1, 20));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setText("SUMA PARES:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, -1, -1));

        reorganizar.setBackground(new java.awt.Color(255, 153, 255));
        reorganizar.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        reorganizar.setText("Reorganizar");
        reorganizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reorganizarActionPerformed(evt);
            }
        });
        getContentPane().add(reorganizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 600, 160, -1));

        jButton39.setBackground(new java.awt.Color(153, 255, 153));
        jButton39.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton39.setText("Ver Resumen");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 560, 157, -1));

        jButton40.setBackground(new java.awt.Color(255, 102, 102));
        jButton40.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton40.setText("CERRAR");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton40, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 600, 150, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel5.setText("NIVEL:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 70, 30));

        niveles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivelesActionPerformed(evt);
            }
        });
        getContentPane().add(niveles, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 80, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondooo.jpg"))); // NOI18N
        jLabel6.setText(".");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton15ActionPerformed

    private void Boton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton16ActionPerformed

    private void Boton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton33ActionPerformed

    private void Boton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton34ActionPerformed

    private void Boton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton32ActionPerformed

    private void Boton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton13ActionPerformed

    private void Boton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton14ActionPerformed

    private void Boton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton31ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed

acercade acerca = new acercade(this); 
acerca.setVisible(true);             
this.setVisible(false);  
    }//GEN-LAST:event_jButton37ActionPerformed

    private void Boton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton18ActionPerformed

    private void Boton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton17ActionPerformed

    private void Boton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton36ActionPerformed

    private void Boton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton35ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        if (!numerosSeleccionados.isEmpty()) {
            DatosCompartidos.primerNumero = String.valueOf(numerosSeleccionados.get(0));
            DatosCompartidos.ultimoNumero = String.valueOf(numerosSeleccionados.get(numerosSeleccionados.size() - 1));
        }

        DatosCompartidos.intentos = intentos.getText();
        DatosCompartidos.puntos = puntos.getText();
        terminado a = new terminado();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton40ActionPerformed

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed

    }//GEN-LAST:event_Boton1ActionPerformed

    private void Boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton9ActionPerformed

    private void Boton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton20ActionPerformed

    private void Boton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton30ActionPerformed

    private void Boton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton24ActionPerformed

    private void reorganizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reorganizarActionPerformed
        numerosSeleccionados.clear();
    }//GEN-LAST:event_reorganizarActionPerformed

    private void nivelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivelesActionPerformed

    }//GEN-LAST:event_nivelesActionPerformed

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
            java.util.logging.Logger.getLogger(botones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(botones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(botones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(botones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new botones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton10;
    private javax.swing.JButton Boton11;
    private javax.swing.JButton Boton12;
    private javax.swing.JButton Boton13;
    private javax.swing.JButton Boton14;
    private javax.swing.JButton Boton15;
    private javax.swing.JButton Boton16;
    private javax.swing.JButton Boton17;
    private javax.swing.JButton Boton18;
    private javax.swing.JButton Boton19;
    private javax.swing.JButton Boton2;
    private javax.swing.JButton Boton20;
    private javax.swing.JButton Boton21;
    private javax.swing.JButton Boton22;
    private javax.swing.JButton Boton23;
    private javax.swing.JButton Boton24;
    private javax.swing.JButton Boton25;
    private javax.swing.JButton Boton26;
    private javax.swing.JButton Boton27;
    private javax.swing.JButton Boton28;
    private javax.swing.JButton Boton29;
    private javax.swing.JButton Boton3;
    private javax.swing.JButton Boton30;
    private javax.swing.JButton Boton31;
    private javax.swing.JButton Boton32;
    private javax.swing.JButton Boton33;
    private javax.swing.JButton Boton34;
    private javax.swing.JButton Boton35;
    private javax.swing.JButton Boton36;
    private javax.swing.JButton Boton4;
    private javax.swing.JButton Boton5;
    private javax.swing.JButton Boton6;
    private javax.swing.JButton Boton7;
    private javax.swing.JButton Boton8;
    private javax.swing.JButton Boton9;
    private javax.swing.JTextField impares;
    private javax.swing.JTextField intentos;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton40;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField niveles;
    private javax.swing.JTextField pares;
    private javax.swing.JTextField puntos;
    private javax.swing.JButton reorganizar;
    // End of variables declaration//GEN-END:variables
}
