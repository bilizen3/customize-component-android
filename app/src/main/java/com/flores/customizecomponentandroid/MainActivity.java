package com.flores.customizecomponentandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import android.os.Bundle;

import com.flores.expandablecardview.ExpandableCardView;
import com.flores.expandablecardview.ItemExpandableCardView;
import com.flores.expandablecardview.model.ItemExpandableEntity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private LinearLayoutCompat llViews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        llViews = findViewById(R.id.llViews);
        ExpandableCardView expandableCardView= new ExpandableCardView(this);
        expandableCardView.setExpirationDate("Vence el 21/02/2019");
        expandableCardView.setNumberOfQuota("S/ 500.00");
        expandableCardView.setAmountOfFee("Nº de cuota - 001");
        expandableCardView.setAmountOfFeeText("Importe de cuota");
        ArrayList<ItemExpandableCardView> itemExpandableCardViews= new ArrayList<>();
        itemExpandableCardViews.add(new ItemExpandableCardView(this,new ItemExpandableEntity(
                "Seguro","S/ 200.00")));
        itemExpandableCardViews.add( new ItemExpandableCardView(this,new ItemExpandableEntity(
                "Seguro","S/ 200.00")));
        itemExpandableCardViews.add( new ItemExpandableCardView(this,new ItemExpandableEntity(
                "Amortización","S/ 300.00")));
        itemExpandableCardViews.add( new ItemExpandableCardView(this,new ItemExpandableEntity(
                "Interés","S/ 0.00")));
        itemExpandableCardViews.add( new ItemExpandableCardView(this,new ItemExpandableEntity(
                "Mora","S/ 0.00")));
        itemExpandableCardViews.add( new ItemExpandableCardView(this,new ItemExpandableEntity(
                "Gastos","S/ 0.00")));
        expandableCardView.addListDetails(itemExpandableCardViews);
        llViews.addView(expandableCardView);
    }
}
