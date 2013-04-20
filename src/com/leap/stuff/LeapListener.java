package com.leap.stuff;

import com.leapmotion.leap.Controller;
import com.leapmotion.leap.Frame;
import com.leapmotion.leap.Listener;

public class LeapListener extends Listener
{

	public LeapListener()
	{
		super();
	}

	public LeapListener(long arg0, boolean arg1)
	{
		super(arg0, arg1);
	}
	
	@Override
	public void onInit(Controller controller)
	{
		super.onInit(controller);
		System.out.println("onInit");
	}
	
	@Override
	public void onConnect(Controller controller)
	{
		super.onConnect(controller);
		System.out.println("onConnect");
	}
	
	@Override
	public void onDisconnect(Controller controller)
	{
		super.onDisconnect(controller);
		System.out.println("onDisconnect");
	}
	
	@Override
	public void onExit(Controller controller)
	{
		super.onExit(controller);
		System.out.println("onExit");
	}
	
	@Override
	public void onFrame(Controller controller)
	{
		super.onFrame(controller);
		System.out.println("onFrame");
		// Get the most recent frame and report some basic information
		Frame frame = controller.frame();
		System.out.println("Frame id: " + frame.id()
		                 + ", timestamp: " + frame.timestamp()
		                 + ", hands: " + frame.hands().count()
		                 + ", fingers: " + frame.fingers().count()
		                 + ", tools: " + frame.tools().count());
	}

}
