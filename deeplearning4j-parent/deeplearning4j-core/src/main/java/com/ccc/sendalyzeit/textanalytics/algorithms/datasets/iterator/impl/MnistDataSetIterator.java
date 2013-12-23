package com.ccc.sendalyzeit.textanalytics.algorithms.datasets.iterator.impl;

import java.io.IOException;

import com.ccc.sendalyzeit.textanalytics.algorithms.datasets.fetchers.MnistDataFetcher;
import com.ccc.sendalyzeit.textanalytics.algorithms.datasets.iterator.BaseDatasetIterator;

public class MnistDataSetIterator extends BaseDatasetIterator {

	public MnistDataSetIterator(int batch) throws IOException {
		super(batch, new MnistDataFetcher());
	}


}
