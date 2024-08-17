import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import  java.util.StringTokenizer;

public class FirstGUI extends JFrame implements ActionListener {
   private JButton bDelete, bClear, bPi, bDivide, b7, b8, b9, bMultiply, b4, b5, b6, bSubtract, b1, b2, b3, bAdd, b0, bDecimal, bPerc, bEquals;
   private JTextField sysDisplay;
   public static final int WIDTH = 452;
   public static final int HEIGHT = 560;
   public static List<String> backEnd;
   public void actionPerformed(ActionEvent e){
      if (e.getSource() == bDelete){
         if(sysDisplay.getText().substring(sysDisplay.getText().length()-1).equals(" ")){
            sysDisplay.setText(sysDisplay.getText().substring(0,sysDisplay.getText().length()-3));
         }
         else if(sysDisplay.getText().equals("Error")||sysDisplay.getText().equals("Infinity")){
            sysDisplay.setText("");
         }
         else {
            sysDisplay.setText(sysDisplay.getText().substring(0,sysDisplay.getText().length()-1));
         }
      }
      else if(e.getSource() == bClear){
         sysDisplay.setText("");
      }
      else if(e.getSource() == bPi){
         if(sysDisplay.getText().equals("Error")||sysDisplay.getText().equals("Infinity")) {
            sysDisplay.setText("π");
         }
         else{
            sysDisplay.setText(sysDisplay.getText()+"π");
         }
      }
      else if(e.getSource() == bDivide){
         if(sysDisplay.getText().equals("Error")||sysDisplay.getText().equals("Infinity")) {
            sysDisplay.setText(" ÷ ");
         }
         else{
            sysDisplay.setText(sysDisplay.getText()+" ÷ ");
         }
      }
      else if(e.getSource() == b7){
         if(!sysDisplay.getText().isEmpty()) {
            if(sysDisplay.getText().equals("Error")||sysDisplay.getText().equals("Infinity")) {
               sysDisplay.setText("7");
            } else{
               sysDisplay.setText(sysDisplay.getText() + "7");
            }
         }
         else{
            sysDisplay.setText(sysDisplay.getText()+"7");
         }
      }
      else if(e.getSource() == b8){
         if(!sysDisplay.getText().isEmpty()) {
            if(sysDisplay.getText().equals("Error")||sysDisplay.getText().equals("Infinity")) {
               sysDisplay.setText("8");
            } else{
               sysDisplay.setText(sysDisplay.getText() + "8");
            }
         }
         else{
            sysDisplay.setText(sysDisplay.getText()+"8");
         }
      }
      else if(e.getSource() == b9){
         if(!sysDisplay.getText().isEmpty()) {
            if(sysDisplay.getText().equals("Error")||sysDisplay.getText().equals("Infinity")) {
               sysDisplay.setText("9");
            } else{
               sysDisplay.setText(sysDisplay.getText() + "9");
            }
         }
         else{
            sysDisplay.setText(sysDisplay.getText()+"9");
         }
      }
      else if(e.getSource() == bMultiply){
         if(sysDisplay.getText().equals("Error")||sysDisplay.getText().equals("Infinity")) {
            sysDisplay.setText(" × ");
         }
         else{
            sysDisplay.setText(sysDisplay.getText()+" × ");
         }
      }
      else if(e.getSource() == b4){
         if(!sysDisplay.getText().isEmpty()) {
            if(sysDisplay.getText().equals("Error")||sysDisplay.getText().equals("Infinity")) {
               sysDisplay.setText("4");
            } else{
               sysDisplay.setText(sysDisplay.getText() + "4");
            }
         }
         else{
            sysDisplay.setText(sysDisplay.getText()+"4");
         }
      }
      else if(e.getSource() == b5){
         if(!sysDisplay.getText().isEmpty()) {
            if(sysDisplay.getText().equals("Error")||sysDisplay.getText().equals("Infinity")) {
               sysDisplay.setText("5");
            } else{
               sysDisplay.setText(sysDisplay.getText() + "5");
            }
         }
         else{
            sysDisplay.setText(sysDisplay.getText()+"5");
         }
      }
      else if(e.getSource() == b6){
         if(!sysDisplay.getText().isEmpty()) {
            if(sysDisplay.getText().equals("Error")||sysDisplay.getText().equals("Infinity")) {
               sysDisplay.setText("6");
            } else{
               sysDisplay.setText(sysDisplay.getText() + "6");
            }
         }
         else{
            sysDisplay.setText(sysDisplay.getText()+"6");
         }
      }
      else if(e.getSource() == bSubtract){
         if(sysDisplay.getText().equals("Error")||sysDisplay.getText().equals("Infinity")) {
            sysDisplay.setText(" - ");
         }else if (sysDisplay.getText().isEmpty()) {
            sysDisplay.setText("−");
         }
         else if(sysDisplay.getText().length()>3){
            if(sysDisplay.getText().substring(sysDisplay.getText().length()-3).equals(" - ")) {
               sysDisplay.setText(sysDisplay.getText().substring(0, sysDisplay.getText().length() - 3) + " + ");
            }
            else if(sysDisplay.getText().substring(sysDisplay.getText().length()-3).equals(" + ")) {
               sysDisplay.setText(sysDisplay.getText().substring(0, sysDisplay.getText().length() - 3) + " - ");
            }
            else{
               sysDisplay.setText(sysDisplay.getText()+" - ");
            }
         }
         else{
            sysDisplay.setText(sysDisplay.getText()+" - ");
         }
      }
      else if(e.getSource() == b1){
         if(!sysDisplay.getText().isEmpty()) {
            if(sysDisplay.getText().equals("Error")||sysDisplay.getText().equals("Infinity")) {
               sysDisplay.setText("1");
            } else{
               sysDisplay.setText(sysDisplay.getText() + "1");
            }
         }
         else{
            sysDisplay.setText(sysDisplay.getText()+"1");
         }
      }
      else if(e.getSource() == b2){
         if(!sysDisplay.getText().isEmpty()) {
            if(sysDisplay.getText().equals("Error")||sysDisplay.getText().equals("Infinity")) {
               sysDisplay.setText("2");
            } else{
               sysDisplay.setText(sysDisplay.getText() + "2");
            }
         }
         else{
            sysDisplay.setText(sysDisplay.getText()+"2");
         }
      }
      else if(e.getSource() == b3){
         if(!sysDisplay.getText().isEmpty()) {
            if(sysDisplay.getText().equals("Error")||sysDisplay.getText().equals("Infinity")) {
               sysDisplay.setText("3");
            } else{
               sysDisplay.setText(sysDisplay.getText()+"3");
            }
         }
         else{
            sysDisplay.setText(sysDisplay.getText()+"3");
         }
      }
      else if(e.getSource() == bAdd){
         if(sysDisplay.getText().equals("Error")||sysDisplay.getText().equals("Infinity")) {
            sysDisplay.setText(" + ");
         } else if (sysDisplay.getText().isEmpty()) {
            sysDisplay.setText("+");
         }else if(sysDisplay.getText().length()>3){
            if(sysDisplay.getText().substring(sysDisplay.getText().length()-3).equals(" + ")) {
               sysDisplay.setText(sysDisplay.getText().substring(0, sysDisplay.getText().length() - 3) + " + ");
            }
            else if(sysDisplay.getText().substring(sysDisplay.getText().length()-3).equals(" - ")) {
               sysDisplay.setText(sysDisplay.getText().substring(0, sysDisplay.getText().length() - 3) + " - ");
            }
            else{
               sysDisplay.setText(sysDisplay.getText()+" + ");
            }
         }
         else{
            sysDisplay.setText(sysDisplay.getText()+" + ");
         }
      }
      else if(e.getSource() == b0){
         if(!sysDisplay.getText().isEmpty()) {
            if(sysDisplay.getText().equals("Error")||sysDisplay.getText().equals("Infinity")) {
               sysDisplay.setText("0");
            } else{
               sysDisplay.setText(sysDisplay.getText()+"0");
            }
         }
         else{
            sysDisplay.setText("0");
         }
      }
      else if(e.getSource() == bDecimal){
         if(sysDisplay.getText().equals("Error")||sysDisplay.getText().equals("Infinity")) {
            sysDisplay.setText(".");
         }
         else{
            sysDisplay.setText(sysDisplay.getText()+".");
         }
      }
      else if(e.getSource() == bPerc){
         if(sysDisplay.getText().equals("Error")||sysDisplay.getText().equals("Infinity")) {
            sysDisplay.setText("%");
         }
         else{
            sysDisplay.setText(sysDisplay.getText()+"%");
         }
      }
      else if(e.getSource() == bEquals){
          String result = null;
          try {
              result = valuate(sysDisplay.getText());
              //sysDisplay.setText(result);
          } catch (Exception ex) {
             result = "Error";
             //sysDisplay.setText(result);
             //ex.printStackTrace();
          }
          if(result.substring(result.length()-2).equals(".0")){
            sysDisplay.setText(result.substring(0,result.length()-2));
         }
         else{
            sysDisplay.setText(result);
         }
      }
   }
   public static String valuate(String eq) throws Exception{
      eq = eq.replaceAll("%", " / 100 ");
      eq = eq.replaceAll("π", " * 3.141592654 ");
      eq = eq.replaceAll("÷", "/");
      eq = eq.replaceAll("×", "*");
      eq = eq.replaceAll("−", "-");
      StringTokenizer result = new StringTokenizer(eq," ");
      List<String> comparison = new ArrayList<>();
      comparison.add("/");
      comparison.add("*");
      comparison.add("+");
      comparison.add("-");
      List<Double> nums = new ArrayList<>();
      List<String> signs = new ArrayList<>();
      for(int z = 0; z<eq.length(); z++){
         if(comparison.contains(eq.substring(z,z+1))&&eq.substring(z+1,z+2).equals(" ")){
            signs.add(eq.substring(z,z+1));
         }
      }
      String answer = "";
      try{
         while(result.hasMoreTokens()){
            String s2 = result.nextToken();
            if(!comparison.contains(s2)){
               nums.add((Double.parseDouble(s2)));
            }
         }
         double constant = 0;
         int pointer = 0;
         int op = signs.size();
         //System.out.println(nums);
         //System.out.println(signs);
         if((nums.size()-1)!=signs.size()){
            return "Error";
         } else if (nums.size()==1) {
            return ""+nums.get(0);
         } else{
            //System.out.println("op :"+op+" "+signs.size());
            for (int k = op; k>0; k--){
               if(signs.contains("/")){
                  pointer = signs.indexOf("/");
                  constant = nums.get(pointer)/nums.get(pointer+1);
                  nums.set(pointer, constant);
                  nums.set(pointer+1, null);
                  signs.set(pointer,null);
                  for (int a = pointer+1; a<(nums.size()-1); a++){
                     if(nums.get(a+1)!=null) {
                        double temp = nums.get(a + 1);
                        nums.set(a + 1, null);
                        nums.set(a, temp);
                        String temp2 = signs.get(a);
                        signs.set(a, null);
                        signs.set(a - 1, temp2);
                     }
                  }
               }
               else if(signs.contains("*")){
                  pointer = signs.indexOf("*");
                  constant = nums.get(pointer)*nums.get(pointer+1);
                  nums.set(pointer, constant);
                  nums.set(pointer+1, null);
                  signs.set(pointer,null);
                  for (int b = pointer+1; b<(nums.size()-1); b++){
                     if(nums.get(b+1)!=null) {
                        double temp = nums.get(b + 1);
                        nums.set(b + 1, null);
                        nums.set(b, temp);
                        String temp2 = signs.get(b);
                        signs.set(b, null);
                        signs.set(b - 1, temp2);
                     }
                  }
               }
               else if(signs.contains("+")){
                  pointer = signs.indexOf("+");
                  constant = nums.get(pointer)+nums.get(pointer+1);
                  nums.set(pointer, constant);
                  nums.set(pointer+1, null);
                  signs.set(pointer,null);
                  for (int c = pointer+1; c<(nums.size()-1); c++){
                     //System.out.println(nums);
                     if(nums.get(c+1)!=null) {
                        double temp = nums.get(c + 1);
                        nums.set(c + 1, null);
                        nums.set(c, temp);
                        String temp2 = signs.get(c);
                        signs.set(c, null);
                        signs.set(c - 1, temp2);
                     }
                  }
               }
               else if(signs.contains("-")){
                  pointer = signs.indexOf("-");
                  constant = nums.get(pointer)-nums.get(pointer+1);
                  nums.set(pointer, constant);
                  nums.set(pointer+1, null);
                  signs.set(pointer,null);
                  for (int d = pointer+1; d<(nums.size()-1); d++){
                     if(nums.get(d+1)!=null) {
                        double temp = nums.get(d + 1);
                        nums.set(d + 1, null);
                        nums.set(d, temp);
                        String temp2 = signs.get(d);
                        signs.set(d, null);
                        signs.set(d - 1, temp2);
                     }
                  }
               }
               answer = ""+nums.get(0);
            }
         }
      }catch (Exception e){
         answer = "Error";
         //e.printStackTrace();
      }
      return answer;
   }
   public FirstGUI(){
      JFrame mainFrame = new JFrame("Khosa Industries");
      mainFrame.setDefaultCloseOperation(mainFrame.EXIT_ON_CLOSE);
      mainFrame.getContentPane().setBackground(Color.ORANGE);
      mainFrame.setSize(WIDTH, HEIGHT);
      mainFrame.setResizable(false);
      mainFrame.setLayout(new FlowLayout()); // Set layout manager
      JLabel top = new JLabel("Andziso's Demo App");
      mainFrame.add(top);
      sysDisplay = new JTextField();
      sysDisplay.setFont(new Font("Arial", Font.BOLD, 35));
      sysDisplay.setEditable(false);
      sysDisplay.setPreferredSize(new Dimension(WIDTH,80));
      System.out.println(sysDisplay.getHorizontalVisibility());
      System.out.println(sysDisplay.getHorizontalAlignment());
      sysDisplay.setMargin(new Insets(0,3,0,0));
      mainFrame.add(sysDisplay);
      JPanel secContainer = new JPanel();
      secContainer.setLayout(new GridLayout(0,4));
      String [] button_symbols = {"DEL","C","π","÷","7","8","9","×","4","5","6","−","1","2","3","+","0",".","%","="};
      bDelete = new JButton("");
      bDelete.addActionListener(this);
      bClear = new JButton("");
      bClear.addActionListener(this);
      bPi = new JButton("");
      bPi.addActionListener(this);
      bDivide = new JButton("");
      bDivide.addActionListener(this);
      b7 = new JButton("");
      b7.addActionListener(this);
      b8 = new JButton("");
      b8.addActionListener(this);
      b9 = new JButton("");
      b9.addActionListener(this);
      bMultiply = new JButton("");
      bMultiply.addActionListener(this);
      b4 = new JButton("");
      b4.addActionListener(this);
      b5 = new JButton("");
      b5.addActionListener(this);
      b6 = new JButton("");
      b6.addActionListener(this);
      bSubtract = new JButton("");
      bSubtract.addActionListener(this);
      b1 = new JButton("");
      b1.addActionListener(this);
      b2 = new JButton("");
      b2.addActionListener(this);
      b3 = new JButton("");
      b3.addActionListener(this);
      bAdd = new JButton("");
      bAdd.addActionListener(this);
      b0 = new JButton("");
      b0.addActionListener(this);
      bDecimal = new JButton("");
      bDecimal.addActionListener(this);
      bPerc = new JButton("");
      bPerc.addActionListener(this);
      bEquals = new JButton("");
      bEquals.addActionListener(this);
      JButton [] buttons = {bDelete,bClear,bPi,bDivide,b7,b8,b9,bMultiply,b4,b5,b6,bSubtract,b1,b2,b3,bAdd,b0,bDecimal,bPerc,bEquals};
      int y = 0;
      for(JButton b : buttons){
         b.setBackground(Color.DARK_GRAY);
         b.setForeground(Color.WHITE);
         b.setText(button_symbols[y]);
         secContainer.add(b);
         y++;
      }
      // add buttons to panel
      // Changing the size of all buttons
      for (Component component : secContainer.getComponents()) {
         if (component instanceof JButton) {
            component.setPreferredSize(new Dimension(113, 70)); // Set preferred size
            component.setFont(new Font("Arial", Font.BOLD, 35)); // Set font size (adjust the font size as needed)
         }
      }
      mainFrame.add(secContainer);
      mainFrame.setVisible(true);
   }
   public static void main(String [] args){
      FirstGUI x = new FirstGUI();
   }
}