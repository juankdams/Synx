/*
 * generated by Xtext
 */
package macroscipting.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import macroscipting.ui.internal.MacroActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MacroExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return MacroActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return MacroActivator.getInstance().getInjector(MacroActivator.MACROSCIPTING_MACRO);
	}
	
}
