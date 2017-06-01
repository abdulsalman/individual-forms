package mono.com.syncfusion.schedule;


public class MonthViewSettings_InlineAppointmentTappedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.syncfusion.schedule.MonthViewSettings.InlineAppointmentTappedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onInlineAppointmentTapped:(Ljava/lang/Object;Ljava/util/Calendar;Lcom/syncfusion/schedule/ScheduleAppointment;)V:GetOnInlineAppointmentTapped_Ljava_lang_Object_Ljava_util_Calendar_Lcom_syncfusion_schedule_ScheduleAppointment_Handler:Com.Syncfusion.Schedule.MonthViewSettings/IInlineAppointmentTappedListenerInvoker, Syncfusion.SfSchedule.Android\n" +
			"";
		mono.android.Runtime.register ("Com.Syncfusion.Schedule.MonthViewSettings+IInlineAppointmentTappedListenerImplementor, Syncfusion.SfSchedule.Android, Version=15.1451.0.41, Culture=neutral, PublicKeyToken=null", MonthViewSettings_InlineAppointmentTappedListenerImplementor.class, __md_methods);
	}


	public MonthViewSettings_InlineAppointmentTappedListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MonthViewSettings_InlineAppointmentTappedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Syncfusion.Schedule.MonthViewSettings+IInlineAppointmentTappedListenerImplementor, Syncfusion.SfSchedule.Android, Version=15.1451.0.41, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onInlineAppointmentTapped (java.lang.Object p0, java.util.Calendar p1, com.syncfusion.schedule.ScheduleAppointment p2)
	{
		n_onInlineAppointmentTapped (p0, p1, p2);
	}

	private native void n_onInlineAppointmentTapped (java.lang.Object p0, java.util.Calendar p1, com.syncfusion.schedule.ScheduleAppointment p2);

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
