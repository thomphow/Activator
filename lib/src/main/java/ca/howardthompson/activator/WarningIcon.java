/*
       GNU LESSER GENERAL PUBLIC LICENSE
                       Version 3, 29 June 2007

 Copyright (C) 2007 Free Software Foundation, Inc. <http://fsf.org/>
 Everyone is permitted to copy and distribute verbatim copies
 of this license document, but changing it is not allowed.


  This version of the GNU Lesser General Public License incorporates
the terms and conditions of version 3 of the GNU General Public
License, supplemented by the additional permissions listed below.

  0. Additional Definitions.

  As used herein, "this License" refers to version 3 of the GNU Lesser
General Public License, and the "GNU GPL" refers to version 3 of the GNU
General Public License.

  "The Library" refers to a covered work governed by this License,
other than an Application or a Combined Work as defined below.

  An "Application" is any work that makes use of an interface provided
by the Library, but which is not otherwise based on the Library.
Defining a subclass of a class defined by the Library is deemed a mode
of using an interface provided by the Library.

  A "Combined Work" is a work produced by combining or linking an
Application with the Library.  The particular version of the Library
with which the Combined Work was made is also called the "Linked
Version".

  The "Minimal Corresponding Source" for a Combined Work means the
Corresponding Source for the Combined Work, excluding any source code
for portions of the Combined Work that, considered in isolation, are
based on the Application, and not on the Linked Version.

  The "Corresponding Application Code" for a Combined Work means the
object code and/or source code for the Application, including any data
and utility programs needed for reproducing the Combined Work from the
Application, but excluding the System Libraries of the Combined Work.

  1. Exception to Section 3 of the GNU GPL.

  You may convey a covered work under sections 3 and 4 of this License
without being bound by section 3 of the GNU GPL.

  2. Conveying Modified Versions.

  If you modify a copy of the Library, and, in your modifications, a
facility refers to a function or data to be supplied by an Application
that uses the facility (other than as an argument passed when the
facility is invoked), then you may convey a copy of the modified
version:

   a) under this License, provided that you make a good faith effort to
   ensure that, in the event an Application does not supply the
   function or data, the facility still operates, and performs
   whatever part of its purpose remains meaningful, or

   b) under the GNU GPL, with none of the additional permissions of
   this License applicable to that copy.

  3. Object Code Incorporating Material from Library Header Files.

  The object code form of an Application may incorporate material from
a header file that is part of the Library.  You may convey such object
code under terms of your choice, provided that, if the incorporated
material is not limited to numerical parameters, data structure
layouts and accessors, or small macros, inline functions and templates
(ten or fewer lines in length), you do both of the following:

   a) Give prominent notice with each copy of the object code that the
   Library is used in it and that the Library and its use are
   covered by this License.

   b) Accompany the object code with a copy of the GNU GPL and this license
   document.

  4. Combined Works.

  You may convey a Combined Work under terms of your choice that,
taken together, effectively do not restrict modification of the
portions of the Library contained in the Combined Work and reverse
engineering for debugging such modifications, if you also do each of
the following:

   a) Give prominent notice with each copy of the Combined Work that
   the Library is used in it and that the Library and its use are
   covered by this License.

   b) Accompany the Combined Work with a copy of the GNU GPL and this license
   document.

   c) For a Combined Work that displays copyright notices during
   execution, include the copyright notice for the Library among
   these notices, as well as a reference directing the user to the
   copies of the GNU GPL and this license document.

   d) Do one of the following:

       0) Convey the Minimal Corresponding Source under the terms of this
       License, and the Corresponding Application Code in a form
       suitable for, and under terms that permit, the user to
       recombine or relink the Application with a modified version of
       the Linked Version to produce a modified Combined Work, in the
       manner specified by section 6 of the GNU GPL for conveying
       Corresponding Source.

       1) Use a suitable shared library mechanism for linking with the
       Library.  A suitable mechanism is one that (a) uses at run time
       a copy of the Library already present on the user's computer
       system, and (b) will operate properly with a modified version
       of the Library that is interface-compatible with the Linked
       Version.

   e) Provide Installation Information, but only if you would otherwise
   be required to provide such information under section 6 of the
   GNU GPL, and only to the extent that such information is
   necessary to install and execute a modified version of the
   Combined Work produced by recombining or relinking the
   Application with a modified version of the Linked Version. (If
   you use option 4d0, the Installation Information must accompany
   the Minimal Corresponding Source and Corresponding Application
   Code. If you use option 4d1, you must provide the Installation
   Information in the manner specified by section 6 of the GNU GPL
   for conveying Corresponding Source.)

  5. Combined Libraries.

  You may place library facilities that are a work based on the
Library side by side in a single library together with other library
facilities that are not Applications and are not covered by this
License, and convey such a combined library under terms of your
choice, if you do both of the following:

   a) Accompany the combined library with a copy of the same work based
   on the Library, uncombined with any other library facilities,
   conveyed under the terms of this License.

   b) Give prominent notice with the combined library that part of it
   is a work based on the Library, and explaining where to find the
   accompanying uncombined form of the same work.

  6. Revised Versions of the GNU Lesser General Public License.

  The Free Software Foundation may publish revised and/or new versions
of the GNU Lesser General Public License from time to time. Such new
versions will be similar in spirit to the present version, but may
differ in detail to address new problems or concerns.

  Each version is given a distinguishing version number. If the
Library as you received it specifies that a certain numbered version
of the GNU Lesser General Public License "or any later version"
applies to it, you have the option of following the terms and
conditions either of that published version or of any later version
published by the Free Software Foundation. If the Library as you
received it does not specify a version number of the GNU Lesser
General Public License, you may choose any version of the GNU Lesser
General Public License ever published by the Free Software Foundation.

  If the Library as you received it specifies that a proxy can decide
whether future versions of the GNU Lesser General Public License shall
apply, that proxy's public statement of acceptance of any version is
permanent authorization for you to choose that version for the
Library.
 */


package ca.howardthompson.activator;

import android.graphics.drawable.Drawable;


public class WarningIcon extends ByteArrayDrawable {

	private static byte[] getBytes() {
		byte[] buffer = { -119, 80, 78, 71, 13, 10, 26, 10, 0, 0, 0, 13, 73, 72, 68, 82, 0, 0, 0, 32, 0, 0, 0, 32, 8,
				6, 0, 0, 0, 115, 122, 122, -12, 0, 0, 0, 4, 115, 66, 73, 84, 8, 8, 8, 8, 124, 8, 100, -120, 0, 0, 6,
				-106, 73, 68, 65, 84, 88, -123, -27, -106, 93, 108, 92, 71, 21, -57, 127, 51, 115, -17, -35, 47, -37,
				119, -41, 94, -41, 31, 107, 111, -20, -90, 73, -102, 47, 123, 81, -102, 54, 84, -78, -110, 8, 4, 82,
				-123, -94, 90, 72, 40, 105, 121, 71, -30, -87, 111, 124, 62, 4, -119, -105, 60, -59, 69, 96, -83, 99,
				82, 9, 21, 65, 68, 17, 45, 8, -87, 32, -107, -60, 69, -128, -110, 22, -80, 9, 85, -108, 56, 118, 98,
				39, 113, -30, -59, -79, -45, -11, -57, 122, 119, -17, -99, 25, 30, -42, 117, 41, 109, -119, -19, 74,
				-68, 116, -92, -93, -71, 51, -9, -50, -1, -4, -49, -1, -52, -100, -71, -16, 105, 111, 98, -85, 11,
				-121, -122, -122, -4, -6, 84, 42, 55, 123, 103, -106, 66, 97, 102, -20, -44, -87, 83, -59, -83, -32,
				-56, -83, 18, -16, 60, 111, 36, -26, 121, 35, 13, 13, -119, 17, 99, 76, 110, -85, 56, 91, 34, -112,
				-49, -25, 123, 65, -28, 18, -15, 4, -39, 108, 22, -57, 113, 71, 50, -103, -18, -34, -1, 27, 1, 96, -96,
				-79, 41, 77, 16, -116, -93, -11, 117, 122, 123, 63, 67, 95, -33, -95, -127, -83, 0, -87, -51, 46, 24,
				28, 28, 60, -100, 72, 36, 78, -90, -110, 41, -74, 101, 94, -94, -77, -3, -97, -84, 86, -66, 0, 66, 116,
				57, -114, 51, 50, 49, 49, 49, -67, 25, -68, 77, 43, -32, -70, -18, 64, 54, -37, 77, -71, -4, 54, -35,
				-35, 111, -111, 110, -70, -124, -85, -34, -90, -89, -25, 0, -99, -99, -39, 77, -85, -80, 41, 5, -122,
				-121, -121, 47, 36, -109, -87, 67, 66, 72, -10, -18, -54, -109, -12, 111, 34, -84, 36, 88, -67, -113,
				81, 95, 38, -111, -120, -73, 54, 54, -90, 94, 27, 29, 29, 45, 108, 20, 115, -61, 10, -44, 54, 30, -71,
				-114, -114, 44, 117, -15, -13, 116, -76, 93, 6, -29, 33, -92, -61, -10, 71, -81, 19, -82, -68, -62,
				-10, -19, 59, 72, -89, -45, 35, -103, 76, 102, -61, 27, 114, -61, 10, 28, 59, 118, -20, 120, 87, 87,
				-41, -77, -114, 92, 98, -9, -114, 23, -103, -102, 114, -104, -68, 89, -49, -52, -35, 4, -27, -118, -57,
				-74, -106, -37, -108, -126, -49, -31, 122, 13, 81, -91, -28, -43, -47, -47, -47, 75, 27, -63, 117, 54,
				-14, -47, -16, -16, -16, -23, 120, 60, -2, 66, 67, 67, 11, 17, -7, 35, -30, -47, 89, 94, 62, -9, 21,
				-126, -48, 39, 12, 45, -83, -51, -73, -8, -6, 87, 47, 82, 45, -2, -118, 125, -5, 95, 96, 98, 98, 98, 0,
				120, 113, 35, -40, 15, 77, -63, -48, -48, -112, 111, -83, 61, -110, -51, 118, 83, -83, -68, -61, -29,
				-37, -33, 0, -93, 48, -58, -30, 56, 18, 41, 45, 97, 16, 96, 66, -121, -35, -39, 11, 44, -50, -3, -115,
				67, -97, 125, -102, -25, -98, 123, 126, 20, -16, 63, 49, 1, 33, 68, -82, -79, -79, 49, -41, -47, -47,
				-50, -74, -42, 95, -30, -120, 21, -80, 14, 82, 84, -87, 84, 42, -84, -84, -84, 96, 76, 5, 7, 7, 69, 64,
				-38, 123, -107, 93, 59, -74, 115, -32, -64, -127, 92, 127, 127, -1, 67, 43, -28, 70, 8, -116, -28, 114,
				7, 41, 46, -4, -111, -90, -6, 119, -48, 65, 28, -84, -125, -75, 101, -106, -105, 87, 40, 46, 46, 17,
				-108, 75, 8, 11, 97, 40, -87, 83, 127, -91, 82, -68, -52, 51, -49, 124, 9, 99, -52, -56, 39, 34, -112,
				-49, -25, 79, -73, -73, 103, 88, 90, -100, 35, -45, -12, 115, -108, -44, 88, -19, 97, -115, 4, 83, 98,
				113, 105, -119, -107, -27, 37, -116, -82, 96, 66, -115, -87, -122, -60, -68, 42, -59, 27, -33, -89, 46,
				17, -29, -60, -119, -25, -23, -21, -21, 59, -3, -65, 124, 124, -20, 41, 56, 115, -26, -52, 97, -49,
				-13, -14, 7, 15, 30, -62, 84, 94, -95, 53, -11, 6, 54, -116, 96, -75, 2, 42, -4, -31, -51, 6, 110, -51,
				-124, 88, 107, -23, -50, -108, 120, 106, -17, 34, 54, -44, 88, 29, -32, 71, -18, 50, 125, 91, -112,
				125, -4, -117, 40, 37, -93, -66, -17, -97, -69, 114, -27, 74, 101, 83, 10, 24, 99, 6, 122, 122, 122,
				89, 42, -34, -96, -75, -31, -9, -24, 106, 4, 19, 74, 76, 32, -48, -85, 30, -70, -70, 76, -87, 84, 66,
				42, 65, -44, 49, 8, 93, -59, 4, 21, 108, 16, -128, -123, 100, -16, 19, -22, -68, 42, -69, 119, -17,
				-55, -115, -113, -113, -113, 124, -100, -97, -113, 36, -112, -49, -25, 123, 125, -33, -49, -59, -94,
				-11, -40, -46, -49, -120, -70, -13, -104, 80, -96, 43, -102, -80, 82, -63, -84, 6, 44, 22, 103, -71,
				54, 126, -115, 127, 21, -26, -88, -82, 22, 41, 47, -52, 19, -84, 46, 18, -108, -106, 9, 75, 101, 124,
				-73, -64, -115, -117, 39, -39, -71, -69, -121, -29, -57, 79, -28, 118, -18, -36, -7, -111, -59, -23,
				67, 117, -32, -20, -39, -77, -67, 90, -21, -111, -50, -50, 46, -26, 11, 127, 98, 127, -26, 60, -107,
				-30, 18, -70, 90, 69, 7, 26, -76, 5, -85, 17, -38, -27, -35, 7, 43, 116, 119, 117, 19, 117, 52, 38, 8,
				-79, -43, 16, -116, 5, 3, 88, 104, -29, 117, -18, 93, -69, -64, -127, 39, 14, 50, 57, 57, 57, 48, 62,
				62, 126, -12, -95, 10, -108, -53, -27, 35, -87, 84, 42, -103, -120, 59, -76, -58, 94, 34, 40, 78, 83,
				93, 94, 66, -105, 3, 76, -96, 49, -95, 70, 88, 75, 125, -52, -32, 121, 17, 124, -33, 39, 17, 17, 53,
				-57, -38, 98, 53, 88, 13, 58, 20, 36, -94, 101, -60, -52, 15, -55, -76, -75, -80, 111, -33, -66, 35,
				-3, -3, -3, -121, 31, 74, 32, 26, -115, 14, 116, 117, 61, 70, -31, -10, 111, -88, 23, -1, 64, 107, 15,
				-93, 37, 70, -41, 28, 96, 12, 70, 27, -38, 26, 13, -119, 122, -97, 120, 60, -127, 35, 87, -63, 2, -70,
				102, -42, 10, 48, 2, 27, 42, 90, 35, -105, -71, 119, -27, -73, 60, 113, -16, 41, -78, -39, 15, -33,
				-106, 31, -8, 39, 28, 28, 28, -68, -48, -42, -106, 57, 18, -113, 26, -78, -34, 55, 72, 70, -17, 96,
				-75, -88, -127, 91, -77, 46, 63, -58, 18, -108, 52, 43, -85, 32, 44, -60, 34, 22, 71, 8, -84, -75, 88,
				35, -64, 72, -84, 1, 107, 21, 24, -53, -115, -5, 29, -60, -97, 124, -103, -55, -87, -37, 124, -25, -37,
				-33, 26, -103, -102, -102, 90, 79, -59, -6, 49, -52, -25, -13, -67, -98, -25, 125, -77, -93, 51, 27,
				-83, -85, -98, -95, 45, -2, 22, 70, -85, -102, 115, 99, -80, -38, -128, 49, -96, 107, -74, 90, 17, -4,
				-32, -43, 102, -90, 22, -78, -20, 105, 127, -128, -93, 76, -115, -84, -111, 88, 43, 106, -75, -62, 10,
				64, -110, -116, 44, 112, -85, 32, 104, -52, -10, 81, 87, 23, 79, 22, 10, -123, -33, -51, -49, -49, 23,
				62, -112, 2, -91, -44, 88, 118, 91, 119, 114, 97, -10, -17, -76, 70, -1, -126, -47, 94, -19, -75, 22,
				-96, 37, -104, -9, 122, -119, -112, -118, 95, -100, -113, -16, -45, -41, 53, -105, 38, 119, 112, 113,
				-14, 81, -80, 10, -16, -80, 120, 88, -21, 1, 30, 8, 15, -124, -117, 116, 99, 100, -52, -81, -95, 50,
				-57, -66, -98, -34, -28, -47, -93, -97, 63, -14, -98, 95, 103, 77, -6, -45, -47, 104, -116, -46, 74,
				-119, 102, -25, 53, 98, 17, -119, -43, 73, -84, -75, -96, 44, 72, -117, -75, 6, 33, 44, -62, 26, -84,
				40, -95, 109, -126, -70, -70, 8, -23, -26, 38, -86, 38, -123, -29, 53, -94, -115, -117, -43, 18, -5,
				31, -39, 21, 107, -93, -108, 27, 50, 115, -3, -57, -76, -20, -1, 46, -39, 108, -57, -6, 109, -87, -122,
				-122, -122, 124, -91, -44, -55, -106, -106, -74, -42, -22, -30, -97, 121, 114, -25, 85, -124, 106, 68,
				58, 62, 74, 37, 81, -114, -113, 82, 62, -54, 77, -30, -72, 73, -92, -101, -60, 113, 31, -95, -69, -61,
				103, 110, -79, -127, -57, -78, 62, 79, -17, 90, -96, -87, -87, 25, -27, -90, -112, -111, 20, 42, -110,
				124, -33, -94, 62, 110, 52, -119, 23, 79, -31, -54, 69, -26, -106, -37, 72, 54, 119, -45, -48, 80, -1,
				-20, -51, -101, 55, -49, 57, -75, -37, -82, 41, -89, 100, 72, 79, -41, 29, -112, -99, 8, 1, 8, 1, -46,
				-82, 109, 64, -34, -113, -58, -42, -26, 30, 105, -122, -17, 125, -51, 82, -82, 44, 83, 31, -17, -60,
				34, 0, -127, 88, -113, 28, -64, 34, 100, -19, 89, 8, 104, -17, -76, -108, -17, 94, 100, 62, 113, -126,
				61, 123, -10, -26, -118, -59, 98, -50, 9, -61, -112, 120, 60, -114, -29, -70, 92, -67, 119, -124, -22,
				-11, 34, 66, 10, -92, 84, -72, 74, -94, -108, 66, 57, 14, -114, 114, 106, -67, 35, -111, -54, 65, 73,
				-123, -108, 2, 17, 19, -68, -85, 45, -58, 24, -76, -47, -24, -80, 102, -43, 48, -60, 104, -115, -42,
				33, -95, -82, -51, 89, 99, 80, -111, 24, 117, 110, -108, 116, 58, 77, 58, -35, -118, 51, 61, 61, 61,
				54, 59, 91, 24, -109, 82, -26, 64, 32, -60, 90, 4, 82, 32, -91, 68, 74, 85, 35, 33, -27, -38, 88, 34,
				85, -51, -71, -108, -75, -88, -115, 49, 53, -45, 102, -99, -120, -47, 26, 109, 12, 122, 109, -50, 24,
				-125, 53, 6, 120, 0, -52, 48, 63, 63, 63, 118, -1, 126, 97, -20, -65, -21, -62, -89, -81, -3, 27, 29,
				86, -18, -32, 65, -107, -83, 115, 0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126 };
		return buffer;
	}
	
	public static Drawable getDrawable() {
		return ByteArrayDrawable.bytesToDrawable(getBytes());
	}


}
