package mono.com.syncfusion.schedule;


public class SfSchedule_monthViewItemChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.syncfusion.schedule.SfSchedule.monthViewItemChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMonthViewItemChanged:(Lcom/syncfusion/schedule/MonthItem;)V:GetOnMonthViewItemChanged_Lcom_syncfusion_schedule_MonthItem_Handler:Com.Syncfusion.Schedule.SfSchedule/IMonthViewItemChangedListenerInvoker, Syncfusion.SfSchedule.Android\n" +
			"";
		mono.android.Runtime.register ("Com.Syncfusion.Schedule.SfSchedule+IMonthViewItemChangedListenerImplementor, Syncfusion.SfSchedule.Android, Version=15.1451.0.41, Culture=neutral, PublicKeyToken=null", SfSchedule_monthViewItemChangedListenerImplementor.class, __md_methods);
	}


	public SfSchedule_monthViewItemChangedListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == SfSchedule_monthViewItemChangedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Syncfusion.Schedule.SfSchedule+IMonthViewItemChangedListenerImplementor, Syncfusion.SfSchedule.Android, Version=15.1451.0.41, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onMonthViewItemChanged (com.syncfusion.schedule.MonthItem p0)
	{
		n_onMonthViewItemChanged (p0);
	}

	private native void n_onMonthViewItemChanged (com.syncfusion.schedule.MonthItem p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
