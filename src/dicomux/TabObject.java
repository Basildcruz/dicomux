package dicomux;

import javax.swing.JComponent;
import javax.swing.JLabel;

import org.dcm4che2.data.DicomObject;

//TODO redesign
/**
 * data transfer object between IModel and IView
 * @author heidi
 *
 */
public class TabObject {
	private DicomObject m_dicomObj;
	private IPlugin m_plugin;
	private String m_name;
	private TabState m_tabState;

	/**
	 * default constructor
	 */
	public TabObject() {
		m_dicomObj = null;
		m_plugin = null;
		m_name = "";
		m_tabState = null;
	}
	
	/**
	 * @param dicomObj
	 * @param plugin
	 * @param name
	 * @param tabContent
	 */
	public TabObject(TabState tabState) {
		m_dicomObj = null;
		m_plugin = null;
		m_name = null;
		m_tabState = tabState;
	}
	
	/**
	 * 
	 * @return content from the plugin
	 */
	public JComponent getContent() {
		if (m_plugin != null)
			return m_plugin.getContent();
		else
			return new JLabel("ERROR: No plug-in loaded for this tab!");
	}
	
	/**
	 * @return the m_dicomObj
	 */
	public DicomObject getDicomObj() {
		return m_dicomObj;
	}
	
	/**
	 * @param mDicomObj the m_dicomObj to set
	 */
	public void setDicomObj(DicomObject dicomObj) {
		m_dicomObj = dicomObj;
	}
	
	/**
	 * @return the m_plugin
	 */
	public IPlugin getPlugin() {
		return m_plugin;
	}
	
	/**
	 * @param mPlugin the m_plugin to set
	 */
	public void setPlugin(IPlugin plugin) {
		m_plugin = plugin;
	}
	
	/**
	 * @return the m_name
	 */
	public String getName() {
		return m_name;
	}
	
	/**
	 * @param mName the m_name to set
	 */
	public void setName(String name) {
		m_name = name;
	}
	
	/**
	 * @return the m_tabState
	 */
	public TabState getTabState() {
		return m_tabState;
	}
	
	/**
	 * @param mTabContent the m_tabContent to set
	 */
	public void setTabContent(TabState tabState) {
		m_tabState = tabState;
	}
}