package org.charts.dataviewer.api.data;

import com.google.gson.Gson;
import org.charts.dataviewer.api.trace.GenericTrace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A Container of all the Traces to be plotted.
 * 
 * @author jasrodis
 */
public class PlotData {

	protected final String type = "PAYLOAD";

	private final transient Gson gson = new Gson();
	private List<GenericTrace<?>> traces = new ArrayList<>();

	public PlotData() {
		// Empty
	}

	/**
	 * Add all traces into the DataViewer (varargs)
	 * 
	 * @param traces
	 */
	public PlotData(GenericTrace<?>... traces) {
		addAll(traces);
	}

	/**
	 * Returns a list with all the traces present in the DataViewer.
	 * 
	 * @return traces List<GenericTrace<?>>
	 */
	public List<GenericTrace<?>> getAllTraces() {
		return traces;
	}

	/**
	 * Adds a single trace to the DataViewer.
	 * 
	 * @param trace
	 *            GenericTrace<?>
	 */
	public void addTrace(GenericTrace<?> trace) {
		traces.add(trace);
	}

	/**
	 * Add all traces into the DataViewer (varargs)
	 * 
	 * @param traces
	 */
	public void addAll(GenericTrace<?>... traces) {
		this.traces.addAll(Arrays.asList(traces));
	}

	/**
	 * Serialize the PlotData object
	 * 
	 * @return serialized plotData Object
	 */
	public String serialize() {
		return gson.toJson(this);
	}

}
