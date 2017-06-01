package mono.com.syncfusion.schedule;


public class SfSchedule_ScheduleViewChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.syncfusion.schedule.SfSchedule.ScheduleViewChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_TypeChanged:(Ljava/lang/Object;Lcom/syncfusion/schedule/enums/ScheduleView;)V:GetTypeChanged_Ljava_lang_Object_Lcom_syncfusion_schedule_enums_ScheduleView_Handler:Com.Syncfusion.Schedule.SfSchedule/IScheduleViewChangedListenerInvoker, Syncfusion.SfSchedule.Android\n" +
			"";
		mono.android.Runtime.register ("Com.Syncfusion.Schedule.SfSchedule+IScheduleViewChangedListenerImplementor, Syncfusion.SfSchedule.Android, Version=15.1451.0.41, Culture=neutral, PublicKeyToken=null", SfSchedule_ScheduleViewChangedListenerImplementor.class, __md_methods);
	}


	public SfSchedule_ScheduleViewChangedListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == SfSchedule_ScheduleViewChangedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Syncfusion.Schedule.SfSchedule+IScheduleViewChangedListenerImplementor, Syncfusion.SfSchedule.Android, Version=15.1451.0.41, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void TypeChanged (java.lang.Object p0, com.syncfusion.schedule.enums.ScheduleView p1)
	{
		n_TypeChanged (p0, p1);
	}

	private native void n_TypeChanged (java.lang.Object p0, com.syncfusion.schedule.enums.ScheduleView p1);

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
