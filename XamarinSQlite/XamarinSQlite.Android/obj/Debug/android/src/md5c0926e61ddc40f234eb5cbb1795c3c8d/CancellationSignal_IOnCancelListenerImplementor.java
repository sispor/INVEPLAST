package md5c0926e61ddc40f234eb5cbb1795c3c8d;


public class CancellationSignal_IOnCancelListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		md5c0926e61ddc40f234eb5cbb1795c3c8d.CancellationSignal_IOnCancelListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCancel:()V:GetOnCancelHandler:Android.Support.V4.OS.CancellationSignal/IOnCancelListenerInvoker, Xamarin.Android.Support.v4\n" +
			"";
		mono.android.Runtime.register ("Android.Support.V4.OS.CancellationSignal+IOnCancelListenerImplementor, Xamarin.Android.Support.v4", CancellationSignal_IOnCancelListenerImplementor.class, __md_methods);
	}


	public CancellationSignal_IOnCancelListenerImplementor ()
	{
		super ();
		if (getClass () == CancellationSignal_IOnCancelListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Support.V4.OS.CancellationSignal+IOnCancelListenerImplementor, Xamarin.Android.Support.v4", "", this, new java.lang.Object[] {  });
	}


	public void onCancel ()
	{
		n_onCancel ();
	}

	private native void n_onCancel ();

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
