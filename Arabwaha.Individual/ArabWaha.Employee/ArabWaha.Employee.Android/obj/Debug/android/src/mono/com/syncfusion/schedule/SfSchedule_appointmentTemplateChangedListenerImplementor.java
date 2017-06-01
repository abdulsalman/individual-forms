package mono.com.syncfusion.schedule;


public class SfSchedule_appointmentTemplateChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.syncfusion.schedule.SfSchedule.appointmentTemplateChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAppointmentTemplateChanged:(Lcom/syncfusion/schedule/AppointmentItem;)V:GetOnAppointmentTemplateChanged_Lcom_syncfusion_schedule_AppointmentItem_Handler:Com.Syncfusion.Schedule.SfSchedule/IAppointmentTemplateChangedListenerInvoker, Syncfusion.SfSchedule.Android\n" +
			"";
		mono.android.Runtime.register ("Com.Syncfusion.Schedule.SfSchedule+IAppointmentTemplateChangedListenerImplementor, Syncfusion.SfSchedule.Android, Version=15.1451.0.41, Culture=neutral, PublicKeyToken=null", SfSchedule_appointmentTemplateChangedListenerImplementor.class, __md_methods);
	}


	public SfSchedule_appointmentTemplateChangedListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == SfSchedule_appointmentTemplateChangedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Syncfusion.Schedule.SfSchedule+IAppointmentTemplateChangedListenerImplementor, Syncfusion.SfSchedule.Android, Version=15.1451.0.41, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onAppointmentTemplateChanged (com.syncfusion.schedule.AppointmentItem p0)
	{
		n_onAppointmentTemplateChanged (p0);
	}

	private native void n_onAppointmentTemplateChanged (com.syncfusion.schedule.AppointmentItem p0);

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
