package com.ahmedco.iterator.test2;


public class AlertCollection implements CollectionSet
{
    static final int MAX_ALERTS = 8;
    int numberOfAlerts = 0;
    Alert[] alertList;

    public AlertCollection(){
        alertList = new Alert[MAX_ALERTS];
        addAlert("Alert 1");
        addAlert("Alert 2");
        addAlert("Alert 3");
        addAlert("Alert 4");
        addAlert("Alert 5");
    }

    public void addAlert(String str){

        Alert alert = new Alert(str);
        if(numberOfAlerts >= MAX_ALERTS)
             System.err.println("COMPLETED");
        else {
           alertList[numberOfAlerts] = alert;
           numberOfAlerts = numberOfAlerts + 1;
        }
    }

    public Iterator createIterator(){
        return new AlertIterator(alertList);
    }
}