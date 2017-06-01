package mono.com.syncfusion.schedule;


public class SfSchedule_monthInlineAppointmentLoadedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.syncfusion.schedule.SfSchedule.monthInlineAppointmentLoadedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMonthInlineAppointmentLoaded:(Lcom/syncfusion/schedule/MonthInlineAppointmentLoadedArgs;)V:GetOnMonthInlineAppointmentLoaded_Lcom_syncfusion_schedule_MonthInlineAppointmentLoadedArgs_Handler:Com.Syncfusion.Schedule.SfSchedule/IMonthInlineAppointmentLoadedListenerInvoker, Syncfusion.SfSchedule.Android\n" +
			"";
		mono.android.Runtime.register ("Com.Syncfusion.Schedule.SfSchedule+IMonthInlineAppointmentLoadedListenerImplementor, Syncfusion.SfSchedule.Android, Version=15.1451.0.41, Culture=neutral, PublicKeyToken=null", SfSchedule_monthInlineAppointmentLoadedListenerImplementor.class, __md_methods);
	}


	public SfSchedule_monthInlineAppointmentLoadedListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == SfSchedule_monthInlineAppointmentLoadedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Syncfusion.Schedule.SfSchedule+IMonthInlineAppointmentLoadedListenerImplementor, Syncfusion.SfSchedule.Android, Version=15.1451.0.41, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onMonthInlineAppointmentLoaded (com.syncfusion.schedule.MonthInlineAppointmentLoadedArgs p0)
	{
		n_onMonthInlineAppointmentLoaded (p0);
	}

	private native void n_onMonthInlineAppointmentLoaded (com.syncfusion.schedule.MonthInlineAppointmentLoadedArgs p0);

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
