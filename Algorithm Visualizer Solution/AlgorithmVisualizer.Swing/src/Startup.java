import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Controllers.*;
import Controllers.SortingAlgorithms.BubbleSortController;
import Models.*;
import Models.SortingAlgorithms.BubbleSortModel;
import Views.*;
import Views.SortingAlgorithms.BubbleSortView;
import SharedComponents.*;

public class Startup implements ActionListener {
    public static void main(String[] args) {
        HomeModel homeModel = new HomeModel();
        HomeView homeView = new HomeView();
        HomeController homeController = new HomeController(homeModel, homeView);
        
        BubbleSortModel bubbleSortModel = new BubbleSortModel();
        BubbleSortView bubbleSortView = new BubbleSortView();
        BubbleSortController bubbleSortController = new BubbleSortController(bubbleSortModel, bubbleSortView);

        SettingsModel settingsModel = new SettingsModel();
        SettingsView settingsView = new SettingsView();
        SettingsController settingsController = new SettingsController(settingsView, settingsModel);

        JFrame frame = new JFrame();
        frame.setSize(600,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(bubbleSortView);
        frame.add(new SubmitButton("Settings").addActionListener(this));

        // frame.add(homeView);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        JFrame frame = new JFrame();
        frame.setSize(600,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(Startup.settingsView);
        // frame.add(homeView);
        frame.setVisible(true);
    }
}