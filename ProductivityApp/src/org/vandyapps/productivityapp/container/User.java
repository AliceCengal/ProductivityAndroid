package org.vandyapps.productivityapp.container;

import org.vandyapps.productivityapp.network.Network;

public class User {
	private int ID;//hash value, probably; not so sure about this
	private String name;

	private Network myNetworks;

	private Project myProjects;

	private Task myTasks;

	private Msg myMsgs;

	public User() { }
	public User(int identificationhash) { }//construct with hashed ID

	public boolean senduserMsg(Msg msgtosend) {return true; } //send message to other user (touser contained in Msg struct)
	public boolean receiveuserMsg(Msg msgtosend) {return true;} //boolean returned: 0 for didn't work, 1 for did work
	public boolean sendtaskMsg(Msg msgtosend) {return true; } //could also return int if want to use -1, 0, 1 instead
	public boolean receivetaskMsg(Msg msgtosend) {return true; } 
	public boolean get(String field) {return true;} 
	public boolean set(String field, ItemType newval) {return true; }  //ItemType used along with function template definition to allow for fields with any data type
		//above used to change all elements of the user class
		//it would be best to have specific "addtask/rmtask" or "addnetwork/rmnetwork" to handle all the dynamic array business and make it less complex to code
		//this will work for now though i think
		//essentially have a giant switch statement acting on the "field" string to choose which user field to edit
	//public boolean complete(Task finishedtask) { }  //check off a task; mark it complete
	public boolean asktojoinnetwork(Network possiblenetwork) {return true;}  //or integer ID if we're doing that
	public boolean receivenotif(Notification notiftoreceive) {return true; } 

}