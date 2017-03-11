package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int numberOfCoffees = 2;
        display(numberOfCoffees);
        displayPrice(numberOfCoffees*5);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the price on the screen.
     */
    private void displayPrice(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.price_text_view_text_view);
        quantityTextView.setText("$" + number);
    }

    /**
     * This method increments the amount of coffees by one
     */
    public void inc(View view) {
        int currentAmount = 3;
        display(currentAmount);
        displayPrice(currentAmount*5);
    }

    /**
     * This method decrements the amount of coffees by one
     */
    public void dec(View view) {
        int currentAmount = 1;
        display(currentAmount);
        displayPrice(currentAmount*5);
    }

}