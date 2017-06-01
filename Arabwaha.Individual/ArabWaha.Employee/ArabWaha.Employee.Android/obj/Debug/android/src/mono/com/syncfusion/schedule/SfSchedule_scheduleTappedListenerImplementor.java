package mono.com.syncfusion.schedule;


public class SfSchedule_scheduleTappedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.syncfusion.schedule.SfSchedule.scheduleTappedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onScheduleTapped:(Ljava/lang/Object;Ljava/util/Calendar;Lcom/syncfusion/schedule/ScheduleAppointmentCollection;Lcom/syncfusion/schedule/ScheduleAppointment;)V:GetOnScheduleTapped_Ljava_lang_Object_Ljava_util_Calendar_Lcom_syncfusion_schedule_ScheduleAppointmentCollection_Lcom_syncfusion_schedule_ScheduleAppointment_Handler:Com.Syncfusion.Schedule.SfSchedule/IScheduleTappedListenerInvoker, Syncfusion.SfSchedule.Android\n" +
			"";
		mono.android.Runtime.register ("Com.Syncfusion.Schedule.SfSchedule+IScheduleTappedListenerImplementor, Syncfusion.SfSchedule.Android, Version=15.1451.0.41, Culture=neutral, PublicKeyToken=null", SfSchedule_scheduleTappedListenerImplementor.class, __md_methods);
	}


	public SfSchedule_scheduleTappedListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == SfSchedule_scheduleTappedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Syncfusion.Schedule.SfSchedule+IScheduleTappedListenerImplementor, Syncfusion.SfSchedule.Android, Version=15.1451.0.41, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onScheduleTapped (java.lang.Object p0, java.util.Calendar p1, com.syncfusion.schedule.ScheduleAppointmentCollection p2, com.syncfusion.schedule.ScheduleAppointment p3)
	{
		n_onScheduleTapped (p0, p1, p2, p3);
	}

	private native void n_onScheduleTapped (java.lang.Object p0, java.util.Calendar p1, com.syncfusion.schedule.ScheduleAppointmentCollection p2, com.syncfusion.schedule.ScheduleAppointment p3);

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
