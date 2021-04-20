package com.company.Devices;

import com.company.Template.Content;
import com.company.Template.IPublisher;
import com.company.Template.ISubscriber;

public class DeviceCtrl implements ISubscriber {
    protected LightBulb lightBulb_;
    protected PhotoSObs sensor_;
    public  DeviceCtrl(IPublisher publisher, PhotoSObs photoSObs, LightBulb lightBulb){
        lightBulb_ = lightBulb;
        publisher.subscribe(this);
        sensor_= photoSObs;
    }

    @Override
    public void receive(Content content) {
        if (content.source_ instanceof Checker){
            if (((String)content.data_.get(0)).equals("Valid") ){
               lightBulb_.setLit(!sensor_.isDayLight());
            }

        }
    }
}
