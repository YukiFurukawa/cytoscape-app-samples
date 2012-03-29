package org.cytoscape.sample.internal;

import org.cytoscape.application.CyApplicationManager;
import org.cytoscape.model.CyEdge;
import org.cytoscape.task.AbstractNetworkViewTaskFactory;
import org.cytoscape.task.AbstractEdgeViewTaskFactory;
import org.cytoscape.view.model.CyNetworkView;
import org.cytoscape.view.model.View;
import org.cytoscape.work.TaskIterator;

public class MyEdgeViewTaskFactory extends AbstractEdgeViewTaskFactory {

	public MyEdgeViewTaskFactory(){
	
	}
	
	
	@Override
	public TaskIterator createTaskIterator(View<CyEdge> edgeView, CyNetworkView networkView) {
		return new TaskIterator(new MyEdgeViewTask(edgeView, networkView));
	}

}
