package mono.com.syncfusion.schedule;


public class SfSchedule_onAppointmentLoadedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.syncfusion.schedule.SfSchedule.onAppointmentLoadedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAppointmentLoaded:(Lcom/syncfusion/schedule/AppointmentLoadedArgs;)V:GetOnAppointmentLoaded_Lcom_syncfusion_schedule_AppointmentLoadedArgs_Handler:Com.Syncfusion.Schedule.SfSchedule/IOnAppointmentLoadedListenerInvoker, Syncfusion.SfSchedule.Android\n" +
			"";
		mono.android.Runtime.register ("Com.Syncfusion.Schedule.SfSchedule+IOnAppointmentLoadedListenerImplementor, Syncfusion.SfSchedule.Android, Version=15.1451.0.41, Culture=neutral, PublicKeyToken=null", SfSchedule_onAppointmentLoadedListenerImplementor.class, __md_methods);
	}


	public SfSchedule_onAppointmentLoadedListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == SfSchedule_onAppointmentLoadedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Syncfusion.Schedule.SfSchedule+IOnAppointmentLoadedListenerImplementor, Syncfusion.SfSchedule.Android, Version=15.1451.0.41, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onAppointmentLoaded (com.syncfusion.schedule.AppointmentLoadedArgs p0)
	{
		n_onAppointmentLoaded (p0);
	}

	private native void n_onAppointmentLoaded (com.syncfusion.schedule.AppointmentLoadedArgs p0);

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
