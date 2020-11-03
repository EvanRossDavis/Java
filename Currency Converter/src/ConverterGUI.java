
// ConverterGUI.java

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ConverterGUI extends JFrame {

	/**
	 * 
	 * defining all required components
	 * 
	 */

	// an array of currencies to initialize Jcombobox
	Currency currencies[] = { Currency.USD, Currency.EUR, Currency.GBP };
	JComboBox source, target;
	JTextField input, output;
	JButton convertBtn;

	/**
    * constructor to create the GUI
     */

    public ConverterGUI() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 300);

        /**
        * using grid layout with 1 columns and any number of rows
        */
        setLayout(new GridLayout(0, 1));

        /**
        * Creating and adding all UI elements in order
        */
        add(new JLabel("Enter amount:"));
        input = new JTextField();
        add(input);

        add(new JLabel("Select source currency:"));
        source = new JComboBox(currencies);
        add(source);

        add(new JLabel("Select target currency:"));
        target = new JComboBox(currencies);
        add(target);

        add(new JLabel("Result:"));
        output = new JTextField();
        output.setEditable(false);
        add(output);

        convertBtn = new JButton("Convert");
        add(convertBtn);
        setVisible(true);

        /**
        * adding button click listener
        */
        convertBtn.addActionListener(new ActionListener());
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {

            /**
            * getting the amount
            */
            double amount = Double.parseDouble(input.getText());

            /**
            * getting the selected units from combo boxes
            */
            Currency sourceCurrency = (Currency) source.getSelectedItem();
            Currency targetCurrency = (Currency) target.getSelectedItem();

            /**
            * validating source and target units
            */
            if (sourceCurrency == targetCurrency) {
                JOptionPane.showMessageDialog(null,"Source and target currencies are same!");
            } 
            else {
                /**
                * performing the conversion using static method of the Converter class
                */
                double result = Converter.convert(amount, sourceCurrency, targetCurrency);

                /**
                * displaying the results after rounding to 2 decimal places
                */
                output.setText(String.format("%.2f", result));
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Invalid input amount");
        }

    }


}