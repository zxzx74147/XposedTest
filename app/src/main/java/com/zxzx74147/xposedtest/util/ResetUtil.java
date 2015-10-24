package com.zxzx74147.xposedtest.util;

import android.annotation.SuppressLint;


@SuppressLint("NewApi")
public class ResetUtil {
	
//	public static int index;
//
	@SuppressLint("NewApi")
	public static void resetDevice(){
//
//		Build.BOARD = Constants4.BOARD[index];
//		Build.BOOTLOADER = Constants4.BOOTLOADER[index];
//		Build.BRAND = Constants4.BRAND[index];
//		Build.CPU_ABI = Constants4.CPU_ABI[index];
//		Build.CPU_ABI2 = Constants4.CPU_ABI2[index];
//		Build.DEVICE = Constants4.DEVICE[index];
//		Build.DISPLAY = Constants4.DISPLAY[index];
//		Build.FINGERPRINT = Constants4.FINGERPRINT[index];
//		Build.HARDWARE = Constants4.HARDWARE[index];
//		Build.HOST = Constants4.HOST[index];
//		Build.ID = Constants4.ID[index];
//		Build.MANUFACTURER = Constants4.MANUFACTURER[index];
//		Build.MODEL = Constants4.MODEL[index];
//		Build.PRODUCT = Constants4.PRODUCT[index];
//		Build.RADIO = Constants4.RADIO[index];
//		Build.SERIAL = Constants4.SERIAL[index];
//		Build.TAGS = Constants4.TAGS[index];
//		try {
//			Build.TIME = Long.parseLong(Constants4.TIME[index]);
//		} catch (NumberFormatException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		Build.TYPE = Constants4.TYPE[index];
//		Build.UNKNOWN = Constants4.UNKNOWN[index];
//		Build.USER = Constants4.USER[index];
//		Build.VERSION.CODENAME = Constants4.CODENAME[index];
//		Build.VERSION.INCREMENTAL = Constants4.INCREMENTAL[index];
//		Build.VERSION.RELEASE = Constants4.RELEASE[index];
//		Build.VERSION.SDK = Constants4.SDK[index];
//		try {
//			Build.VERSION.SDK_INT = Integer.parseInt(Constants4.SDK_INT[index]);
//		} catch (NumberFormatException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			Build.VERSION.SDK_INT = 19;
//		}
////		 editor.putString("com.baidu.deviceid", android.provider.Settings.System.getString(getContentResolver(), "com.baidu.deviceid"));
////	        editor.putString("bd_setting_i", android.provider.Settings.System.getString(getContentResolver(), "bd_setting_i"));
//
//		android.provider.Settings.Secure.putString(Constants.mContext.getContentResolver(), "android_id", Constants5.Settings_android_id[index]);
////		android.provider.Settings.System.putString(Constants.mContext.getContentResolver(), "com.baidu.deviceid", Constants5.Settings_com_baidu_deviceid[index]);
////		android.provider.Settings.System.putString(Constants.mContext.getContentResolver(), "bd_setting_i", Constants5.Settings_bd_setting_i[index]);
//
//		TelephonyManager.revise = true;
//		((TelephonyManager)Constants.mContext.getSystemService(Context.TELEPHONY_SERVICE)).setDeviceId(Constants5.DeviceId[index]);
//		String phoneNumber = Constants.line1number[index%Constants.line1number.length];
//		if (!phoneNumber.equals("")) {
//			phoneNumber = String.valueOf(Long.parseLong(phoneNumber) + 11 * (index/Constants.line1number.length));
//		}
//		((TelephonyManager)Constants.mContext.getSystemService(Context.TELEPHONY_SERVICE)).setLine1Number(phoneNumber);
//		((TelephonyManager)Constants.mContext.getSystemService(Context.TELEPHONY_SERVICE)).setDeviceSoftwareVersion(Constants5.DeviceSoftwareVersion[index]);
//		((TelephonyManager)Constants.mContext.getSystemService(Context.TELEPHONY_SERVICE)).setSimState(5);
//		((TelephonyManager)Constants.mContext.getSystemService(Context.TELEPHONY_SERVICE)).setSimSerialNumber("");
//		((TelephonyManager)Constants.mContext.getSystemService(Context.TELEPHONY_SERVICE)).setSimOperatorName(Constants5.SimOperatorName[index]);
//		if (index%10 <=2) {
//			((TelephonyManager)Constants.mContext.getSystemService(Context.TELEPHONY_SERVICE)).setSimOperator("46000");
//		}else if(index%10<=5){
//			((TelephonyManager)Constants.mContext.getSystemService(Context.TELEPHONY_SERVICE)).setSimOperator("46002");
//		}else if(index%10<=7){
//			((TelephonyManager)Constants.mContext.getSystemService(Context.TELEPHONY_SERVICE)).setSimOperator("46001");
//		}else {
//			((TelephonyManager)Constants.mContext.getSystemService(Context.TELEPHONY_SERVICE)).setSimOperator("46003");
//		}
////		((TelephonyManager)Constants.mContext.getSystemService(Context.TELEPHONY_SERVICE)).setSimOperator(Constants5.SimOperator[index]);
//		((TelephonyManager)Constants.mContext.getSystemService(Context.TELEPHONY_SERVICE)).setSubscriberId(Constants5.SubscriberId[index]);
//		((TelephonyManager)Constants.mContext.getSystemService(Context.TELEPHONY_SERVICE)).setNetworkCountryIso(Constants5.NetworkCountryIso[index]);
//		((TelephonyManager)Constants.mContext.getSystemService(Context.TELEPHONY_SERVICE)).setNetworkOperator(Constants5.NetworkOperator[index]);
//		((TelephonyManager)Constants.mContext.getSystemService(Context.TELEPHONY_SERVICE)).setNetworkOperatorName(Constants5.NetworkOperatorName[index]);
//		((TelephonyManager)Constants.mContext.getSystemService(Context.TELEPHONY_SERVICE)).setNetworkType(Integer.parseInt(Constants5.NetworkType[index]));
//	//	((TelephonyManager)Constants.mContext.getSystemService(Context.TELEPHONY_SERVICE)).setPhoneType(5);
////		((TelephonyManager)Constants.mContext.getSystemService(Context.TELEPHONY_SERVICE)).setSimState(5);
////		((TelephonyManager)Constants.mContext.getSystemService(Context.TELEPHONY_SERVICE)).setSimState(5);
//
//		int phoneType = ((TelephonyManager)Constants.mContext.getSystemService(Context.TELEPHONY_SERVICE)).getPhoneType();
//		if (phoneType == 1) {
//			GsmCellLocation mLocation = new GsmCellLocation();
//			try {
//				mLocation.setLacAndCid(Integer.parseInt(Constants5.LacOrNetworkId[index]), Integer.parseInt(Constants5.CidOrBaseStationId[index]));
//			} catch (NumberFormatException e) {
//				e.printStackTrace();
//				mLocation.setLacAndCid(0,0);
//			}
//			((TelephonyManager)Constants.mContext.getSystemService(Context.TELEPHONY_SERVICE)).setCellLocation(mLocation);
//		}else {
//			CdmaCellLocation mLocation = new CdmaCellLocation();
//			try {
//				mLocation.setCellLocationData(0, 0, 0, Integer.parseInt(Constants5.LacOrNetworkId[index]), Integer.parseInt(Constants5.CidOrBaseStationId[index]));
//			} catch (NumberFormatException e) {
//				e.printStackTrace();
//				mLocation.setCellLocationData(0, 0, 0,0,0);
//			}
//			((TelephonyManager)Constants.mContext.getSystemService(Context.TELEPHONY_SERVICE)).setCellLocation(mLocation);
//		}
//
////		Display.revise = true;
////		WindowManager localWindowManager = (WindowManager)Constants.mContext.getSystemService("window");
////		localWindowManager.getDefaultDisplay().setHeight(Integer.parseInt(Constants5.DisplayHeight[index]));
////		localWindowManager.getDefaultDisplay().setWidth(Integer.parseInt(Constants5.DisplayWidth[index]));
////
////		DisplayMetrics mDisplayMetrics = new DisplayMetrics();
////		mDisplayMetrics.density = Float.parseFloat(Constants5.density[index]);
////		mDisplayMetrics.densityDpi = Integer.parseInt((Constants5.densityDpi[index]));
////		mDisplayMetrics.heightPixels = Integer.parseInt((Constants5.heightPixels[index]));
////		mDisplayMetrics.scaledDensity = Float.parseFloat((Constants5.scaledDensity[index]));
////		mDisplayMetrics.widthPixels = Integer.parseInt((Constants5.widthPixels[index]));
////		mDisplayMetrics.xdpi = Float.parseFloat(Constants5.xdpi[index]);
////		mDisplayMetrics.ydpi = Float.parseFloat(Constants5.ydpi[index]);
////		localWindowManager.getDefaultDisplay().setMetrics(mDisplayMetrics);
//
//		WifiInfo.revise = true;
//		WifiManager localWifiManager = (WifiManager)Constants.mContext.getSystemService("wifi");
//		localWifiManager.setScanResults(new ArrayList<ScanResult>());
//		localWifiManager.getConnectionInfo().setIpAddress(Integer.parseInt(Constants5.IpAddress[index]));
//		localWifiManager.getConnectionInfo().setMacAddress(Constants5.WifiInfoMacAddress[index]);
////		localWifiManager.getConnectionInfo().(Constants5.WifiInfoMacAddress[index]);
//
//		ActivityManager.revise = true;
//		ActivityManager activityManager = ((ActivityManager)Constants.mContext.getSystemService("activity"));
//		MemoryInfo memoryInfo = new MemoryInfo();
//		memoryInfo.availMem = Long.parseLong(Constants5.availMem[index]);
//		memoryInfo.threshold = Long.parseLong(Constants5.threshold[index]);
//		memoryInfo.totalMem = Long.parseLong(Constants5.totalMem[index]);
//		activityManager.setMemoryInfo(memoryInfo);
//
//		List<RecentTaskInfo> mRecentTaskInfos = new ArrayList<RecentTaskInfo>();
//		for (int i = 0; i < 5; i++) {
//			RecentTaskInfo tmp = new RecentTaskInfo();
//			int random ;
//			if (index == 0) {
//				random = 0;
//			}else {
//				random = ((int)Math.random()*100)%index;
//			}
//			Intent mintent = new Intent();
//			mintent.setClassName(Constants6.randomRecentTasks[random][1], Constants6.randomRecentTasks[random][0]);
//			tmp.baseIntent = mintent;
//			mRecentTaskInfos.add(tmp);
//		}
//		activityManager.setRecentTasksForUser(mRecentTaskInfos);
//
////		List<RunningTaskInfo> mRunningTaskInfos = new ArrayList<RunningTaskInfo>();
////		int runningTaskNum = (int)Math.random()*10+2;
////		for (int i = 0; i < runningTaskNum; i++) {
////			RunningTaskInfo tmp = new RunningTaskInfo();
////			int random = ((int)Math.random()*100)%index;
////			tmp.
////			tmp.baseActivity = new ComConstants6.randomRecentTasks[random][0];
////			Intent mintent = new Intent();
////			mintent.setClassName(Constants6.randomRecentTasks[random][1], Constants6.randomRecentTasks[random][0]);
////			tmp.baseIntent = mintent;
////			mRunningTaskInfos.add(tmp);
////		}
////		activityManager.setRunningTasks(mRunningTaskInfos);
//
//		List<RunningAppProcessInfo> mRunningAppProcessInfos = new ArrayList<RunningAppProcessInfo>();
//		int runningAppNum = (int)Math.random()*10+2;
//		for (int i = 0; i < runningAppNum; i++) {
//			RunningAppProcessInfo tmp = new RunningAppProcessInfo();
//			int random;
//			if (index == 0) {
//				random = 0;
//			}else {
//				random = ((int)Math.random()*100)%index;
//			}
//
//			tmp.processName = Constants6.randomRunningAppProcesses[random];
//			mRunningAppProcessInfos.add(tmp);
//		}
//		activityManager.setRunningAppProcesses(mRunningAppProcessInfos);
//
//		StatFs.revise = true;
//		StatFs.dataf_bavail = Long.parseLong(Constants5.DatagetAvailableBlocks[index]);
//		StatFs.dataf_bfree = Long.parseLong(Constants5.DatagetFreeBlocks[index]);
//		StatFs.dataf_blocks = Long.parseLong(Constants5.DatagetBlockCount[index]);
//		StatFs.dataf_bsize = Long.parseLong(Constants5.DatagetBlockSize[index]);
//		StatFs.sdf_bavail = Long.parseLong(Constants5.ExternalgetAvailableBlocks[index]);
//		StatFs.sdf_bfree = Long.parseLong(Constants5.ExternalgetFreeBlocks[index]);
//		StatFs.sdf_blocks = Long.parseLong(Constants5.ExternalgetBlockCount[index]);
//		StatFs.sdf_bsize = Long.parseLong(Constants5.ExternalgetBlockSize[index]);
//
////		PackageManager mPackageManager = Constants.mContext.getPackageManager();
////		mPackageManager.setInstallerPackageName(targetPackage, installerPackageName)
////
////		List<PackageInfo> mInstalledPackagess = new ArrayList<PackageInfo>();
////		int installedPackageNum = (int)Math.random()*10+5;
////		for (int i = 0; i < installedPackageNum; i++) {
////			PackageInfo tmp = new PackageInfo();
////			int random = ((int)Math.random()*100)%index;
////			tmp.processName = Constants6.randomRunningAppProcesses[random];
////			mInstalledPackagess.add(tmp);
////		}
////		activityManager.set.setRunningAppProcesses(mRunningAppProcessInfos);
//
//
	}
//
//	public static void generateUserIndex(){
//		index = (int)(Math.random()*100);
//		index = index%(Constants4.BOARD.length);
//		System.out.println("generateUserIndex"+index);
//	}
//
//	public static void generateAppIndex(){
//		Constants.currantAppIndex = (int)(Math.random()*100);
//		Constants.currantAppIndex = Constants.currantAppIndex%(Constants.packageName.length);
//	}
//
//	public static void generateRandomUser(){
////		Build.BOARD = Constants.BOARD[index];
////		Build.BRAND = Constants.BRAND[index];
////		Build.HOST = Constants.HOST[index];
////		Build.ID = Constants.ID[index];
////		Build.MANUFACTURER = Constants.MANUFACTURER[index];
////		Build.PRODUCT = Constants.PRODUCT[index];
////		Build.VERSION.RELEASE = Constants.VERSION_RELEASE[index];
////		Build.VERSION.SDK = Constants.VERSION_SDK[index];
////		Build.MODEL = Constants.MODEL[index];
////		((TelephonyManager)Constants.mContext.getSystemService(Context.TELEPHONY_SERVICE)).setDeviceId(Constants.deviceId[index]);
////		((TelephonyManager)Constants.mContext.getSystemService(Context.TELEPHONY_SERVICE)).setLine1Number(Constants.line1number[index]);
////		((TelephonyManager)Constants.mContext.getSystemService(Context.TELEPHONY_SERVICE)).setDeviceSoftwareVersion("01");
////		if (index == 10) {
////			((TelephonyManager)Constants.mContext.getSystemService(Context.TELEPHONY_SERVICE)).setSimOperator("46001");
////		}else {
////			((TelephonyManager)Constants.mContext.getSystemService(Context.TELEPHONY_SERVICE)).setSimOperator("46000");
////		}
//	}
//
//	public static void stopApp(){
//	//  通过Intent类的构造方法指定广播的ID
//        Intent intent = new Intent(Constants.packageName[Constants.currantAppIndex]+".appExit");
//        //  将要广播的数据添加到Intent对象中
//        intent.putExtra("action", "exit");
//        intent.putExtra("index", index);
//        //  发送广播
//        Constants.mContext.sendBroadcast(intent);
//	}
//
//	public static void startApp(){
//		Intent intent = Constants.mContext.getPackageManager().getLaunchIntentForPackage(Constants.packageName[Constants.currantAppIndex]);
//		// 这里如果intent为空，就说名没有安装要跳转的应用嘛
//		if (intent != null) {
//			// 这里跟Activity传递参数一样的嘛，不要担心怎么传递参数，还有接收参数也是跟Activity和Activity传参数一样
//			intent.putExtra("action", "start");
//			Constants.mContext.startActivity(intent);
//		} else {
//			// 没有安装要跳转的app应用，提醒一下
//			Log.e("", "打开2048失败");
//		}
//	}
//
//	public static void saveUserData(){
//		String cmd = "/system/bin/mv "+"/data/data/"+Constants.packageName[Constants.currantAppIndex] + " " +"/data/data/"+Constants.packageName[Constants.currantAppIndex]+index;
//		try {
//			if (Command.executeCommand("sh", true, cmd, null, null) != 0) {
//				System.out.println("saveUserData Command.executeCommand!=0");
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	public static void recoverUserData(){
//		String cmd = "/system/bin/mv "+"/data/data/"+Constants.packageName[Constants.currantAppIndex]+index + " " +"/data/data/"+Constants.packageName[Constants.currantAppIndex];
//		try {
//			if (Command.executeCommand("sh", true, cmd, null, null) != 0) {
//				System.out.println("recoverUserData Command.executeCommand!=0");
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
////		exectLinuxCommand(cmd, true);
//	}
//
//	public static void deleteUserData(){
//		String cmd = "rm "+"/data/data/"+Constants.packageName[Constants.currantAppIndex];
//		try {
//			if (Command.executeCommand("sh", true, cmd, null, null) != 0) {
//				System.out.println("deleteUserData Command.executeCommand!=0");
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
////		exectLinuxCommand(cmd, true);
//	}
//
//
//
//	public static final String COMMAND_SH = "sh";
//    public static final String COMMAND_LINE_END = "\n";
//    public static final String COMMAND_EXIT = "exit\n";
//
//	public static List<String> execute(String[] commands) {
//        List<String> results = new ArrayList<String>();
//        int status = -1;
//        if (commands == null || commands.length == 0) {
//            return null;
//        }
//        System.out.println("execute command start : " + commands);
//        Process process = null;
//        BufferedReader successReader = null;
//        BufferedReader errorReader = null;
//        StringBuilder errorMsg = null;
//
//        DataOutputStream dos = null;
//        try {
//            // TODO
//            process = Runtime.getRuntime().exec(COMMAND_SH);
//            dos = new DataOutputStream(process.getOutputStream());
//            for (String command : commands) {
//                if (command == null) {
//                    continue;
//                }
//                dos.write(command.getBytes());
//                dos.writeBytes(COMMAND_LINE_END);
//                dos.flush();
//            }
//            dos.writeBytes(COMMAND_EXIT);
//            dos.flush();
//
//            status = process.waitFor();
//
//            errorMsg = new StringBuilder();
//            successReader = new BufferedReader(new InputStreamReader(
//                    process.getInputStream()));
//            errorReader = new BufferedReader(new InputStreamReader(
//                    process.getErrorStream()));
//            String lineStr;
//            while ((lineStr = successReader.readLine()) != null) {
//                results.add(lineStr);
//                System.out.println(" command line item : " + lineStr);
//            }
//            while ((lineStr = errorReader.readLine()) != null) {
//                errorMsg.append(lineStr);
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (dos != null) {
//                    dos.close();
//                }
//                if (successReader != null) {
//                    successReader.close();
//                }
//                if (errorReader != null) {
//                    errorReader.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//            if (process != null) {
//                process.destroy();
//            }
//        }
//        System.out.println(String.format(Locale.CHINA,
//                "execute command end,errorMsg:%s,and status %d: ", errorMsg,
//                status));
//        return results;
//    }
//
//	public static void execCmds(String[] command) {
//
//		Process process = null;
//		ByteArrayOutputStream out = null;
//		InputStream in = null;
//		String returnValue = "0";
//		try {
//			process = Runtime.getRuntime().exec(command);
//			in = process.getInputStream();
//			out = new ByteArrayOutputStream();
//			byte[] buffer = new byte[1024];
//			for (int offset = 0; (offset = in.read(buffer)) != -1;) {
//				out.write(buffer, 0, offset);
//			}
//			returnValue = new String(out.toByteArray());
//			System.out.println(returnValue+"结果。。。");
////			process.waitFor();
//		} catch (Exception e) {
//			//return returnValue;
//		} finally {
//			try {
//				if (out != null)
//					out.close();
//				if (in != null)
//					in.close();
//				if (process != null)
//					process.destroy();
//			} catch (Exception e) {
//				//e.printStackTrace();
//			}
//		}
//		//return returnValue;
//	}
//
//	public static void execCmd(String command) {
//
//		Process process = null;
//		ByteArrayOutputStream out = null;
//		InputStream in = null;
//		//String returnValue = "0";
//		try {
//			process = Runtime.getRuntime().exec(command);
////			in = process.getInputStream();
////			out = new ByteArrayOutputStream();
////			byte[] buffer = new byte[1024];
////			for (int offset = 0; (offset = in.read(buffer)) != -1;) {
////				out.write(buffer, 0, offset);
////			}
//			//returnValue = new String(out.toByteArray());
////			process.waitFor();
//		} catch (Exception e) {
//			//return returnValue;
//		} finally {
//			try {
//				if (out != null)
//					out.close();
//				if (in != null)
//					in.close();
//				if (process != null)
//					process.destroy();
//			} catch (Exception e) {
//				//e.printStackTrace();
//			}
//		}
//		//return returnValue;
//	}
//
//	public static void clearDataInSDCard(){
//		for (int i = 0; i < Constants.fileToDelete.length; i++) {
//			File file = new File(android.os.Environment.getExternalStorageDirectory() + "/" + Constants.fileToDelete[i]);
//			if (file.exists()) {
//				file.delete();
//				Log.e("", "删除文件： "+file.getAbsolutePath());
//			}
//		}
//		for (int i = 0; i < Constants.directoryToDelete.length; i++) {
//			deleteDirectory(android.os.Environment.getExternalStorageDirectory() + "/" + Constants.directoryToDelete[i]);
//		}
//	}
//
//	/**
//	 * 删除单个文件
//	 * @param   sPath    被删除文件的文件名
//	 * @return 单个文件删除成功返回true，否则返回false
//	 */
//	public static boolean deleteFile(String sPath) {
//	    boolean flag = false;
//	    File file = new File(sPath);
//	    // 路径为文件且不为空则进行删除
//	    if (file.isFile() && file.exists()) {
//	        file.delete();
//	        Log.e("", "删除文件： "+file.getAbsolutePath());
//	        flag = true;
//	    }
//	    return flag;
//	}
//
//	/**
//	 * 删除目录（文件夹）以及目录下的文件
//	 * @param   sPath 被删除目录的文件路径
//	 * @return  目录删除成功返回true，否则返回false
//	 */
//	public static void deleteDirectory(String sPath) {
//	    //如果sPath不以文件分隔符结尾，自动添加文件分隔符
//	    if (!sPath.endsWith(File.separator)) {
//	        sPath = sPath + File.separator;
//	    }
//	    File dirFile = new File(sPath);
//	    //如果dir对应的文件不存在，或者不是一个目录，则退出
//	    if (!dirFile.exists()) {
//	        return ;
//	    }
//	    if (!dirFile.isDirectory()) {
//			Log.e("", "删除文件： "+dirFile.getAbsolutePath());
//			dirFile.delete();
//			return;
//		}
//	    //删除文件夹下的所有文件(包括子目录)
//	    File[] files = dirFile.listFiles();
//	    for (int i = 0; i < files.length; i++) {
//	        //删除子文件
//	        if (files[i].isFile()) {
//	            deleteFile(files[i].getAbsolutePath());
//	        } //删除子目录
//	        else {
//	            deleteDirectory(files[i].getAbsolutePath());
//	        }
//	    }
//	    //删除当前目录
//	    if (dirFile.delete()) {
//	    	Log.e("", "删除文件： "+dirFile.getAbsolutePath());
//	        return ;
//	    } else {
//	        return ;
//	    }
//	}
//
//	public static void setRandomLocation(){
//		double longitudetmp = longitudeMinimum + Math.random()*(longitudeMaximum - longitudeMinimum);
//		double latitudetmp = latitudeMinimum + Math.random()*(latitudeMaximum - latitudeMinimum);
//		double error = Math.random()*0.0001;
//		if (!randomPositive()) {
//			error = -error;
//		}
//		double error2 = Math.random()*0.0001;
//		if (!randomPositive()) {
//			error2 = -error2;
//		}
//		setRandomNetworkLocation(LocationManager.NETWORK_PROVIDER,longitudetmp+error,latitudetmp+error2);
////		setRandomNetworkLocation(LocationManager.GPS_PROVIDER,longitudetmp+error,latitudetmp+error2);
////		setRandomGpsLocation("gps",longitudetmp,latitudetmp);
//	}
//
//	@SuppressLint("NewApi")
//	public static void setRandomGpsLocation(String mMockProviderName, double longitude, double latitude){
//		LocationManager locationManager = (LocationManager) Constants.mContext.getSystemService(Context.LOCATION_SERVICE);
//		if (locationManager.getProvider(mMockProviderName) == null) {
//			locationManager.addTestProvider(mMockProviderName, false, true,false, false, false, false, false, 0, 5);
//			locationManager.setTestProviderEnabled(mMockProviderName, true);
//		}
//		Location loc = new Location(mMockProviderName);
//		loc.setTime(System.currentTimeMillis());
//		loc.setLatitude(latitude);
//		loc.setLongitude(longitude);
//		loc.setTime(System.currentTimeMillis() - 600*1000-(long)Math.random()*1000000);
//		loc.setAccuracy((float) (Math.random()*10));
//		loc.setElapsedRealtimeNanos(SystemClock.elapsedRealtimeNanos()+(long)Math.random()*10000000);
//		loc.setProvider(mMockProviderName);
//		loc.setAltitude(0);
//		try
//	    {
//	        Method method = Location.class.getMethod("makeComplete");
//	        if (method != null)
//	        {
//	            method.invoke(loc);
//	        }
//	    }
//	    catch (NoSuchMethodException e)
//	    {
//	        e.printStackTrace();
//	    }
//	    catch (Exception e)
//	    {
//	        e.printStackTrace();
//	    }
//		locationManager.setTestProviderLocation(mMockProviderName, loc);
//		Log.i("gps", String.format("once: x=%s y=%s", longitude, latitude));
//
//	}
//	public static void setRandomNetworkLocation(String mMockProviderName,  double longitude, double latitude){
//		LocationManager locationManager = (LocationManager) Constants.mContext.getSystemService(Context.LOCATION_SERVICE);
//		if (locationManager.getProvider(mMockProviderName) == null) {
//			locationManager.addTestProvider(mMockProviderName, false, true,false, false, false, false, false, 0, 5);
//			locationManager.setTestProviderEnabled(mMockProviderName, true);
//		}else {
//			locationManager.removeTestProvider(mMockProviderName);
//			locationManager.addTestProvider(mMockProviderName, false, true,false, false, false, false, false, 0, 5);
//			locationManager.setTestProviderEnabled(mMockProviderName, true);
//		}
//		Location loc = new Location(mMockProviderName);
//		loc.setTime(System.currentTimeMillis());
//		loc.setLatitude(latitude);
//		loc.setLongitude(longitude);
//		loc.setTime(System.currentTimeMillis() - 600*1000-(long)Math.random()*1000000);
//		loc.setAccuracy((float) (Math.random()*200));
//
//		locationManager.setTestProviderLocation(mMockProviderName, loc);
//		Log.i("gps", String.format("once: x=%s y=%s", longitude, latitude));
//
//	}
//
//
//	public static boolean randomPositive(){
//		int tmp = (int) (Math.random()*10);
//		if (tmp %2 == 0) {
//			return true;
//		}else {
//			return false;
//		}
//	}
//
//	// 北京市区的坐标范围
//	static double latitudeMinimum = 39.964;
//	static double latitudeMaximum = 39.97;
//	static double longitudeMinimum = 116.360;
//	static double longitudeMaximum = 116.376;
//
	
}
