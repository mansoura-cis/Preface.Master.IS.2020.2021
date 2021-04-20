package com.company.Template;

public interface IPublisher {
    public void subscribe(ISubscriber subscriber);
    public void unSubscribe(ISubscriber subscriber);
}
