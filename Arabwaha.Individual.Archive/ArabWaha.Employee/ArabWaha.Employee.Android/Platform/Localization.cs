#region FileHeader
// ***********************************************************************
// Assembly         : DragonPassMobile
// Author           : 443628
// Created          : 20-03-2015
// ***********************************************************************
// <copyright file="Localization.cs" company="CTS">
//     Copyright ©  2014
// </copyright>
// <summary></summary>
// *********************************************************************** 
using Xamarin.Forms;
using System.Threading;
using System.Globalization;

#endregion
using System;
using ArabWaha.Core.Localization;

[assembly: Dependency(typeof(ArabWaha.Employee.Droid.Localization_Droid))]
namespace ArabWaha.Employee.Droid
{
    public class Localization_Droid:ICustomLocalization
	{
		/// <summary>
		/// Gets the current culture info.
		/// </summary>
		/// <returns>The current culture info.</returns>
		public CultureInfo GetCurrentCultureInfo ()
		{
			var androidLocale = Java.Util.Locale.Default;
			var netLanguage = androidLocale.ToString().Replace ("_", "-");
			return new System.Globalization.CultureInfo(netLanguage);
		}

		/// <summary>
		/// Sets the locale.
		/// </summary>
		public void SetLocale ()
		{
			var androidLocale = Java.Util.Locale.Default; // user's preferred locale
			var netLocale = androidLocale.ToString().Replace ("_", "-"); 
			var ci = new System.Globalization.CultureInfo (netLocale);

			Thread.CurrentThread.CurrentCulture = ci;
			Thread.CurrentThread.CurrentUICulture = ci;
		}
	}
}

