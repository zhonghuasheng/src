package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/InitialNameServiceOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u111/7883/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Thursday, September 22, 2016 7:25:18 PM PDT
*/


/** Interface used to support binding references in the bootstrap name
    * service.
    */
public interface InitialNameServiceOperations 
{

  /** bind initial name
	*/
  void bind (String name, org.omg.CORBA.Object obj, boolean isPersistant) throws com.sun.corba.se.PortableActivationIDL.InitialNameServicePackage.NameAlreadyBound;
} // interface InitialNameServiceOperations
