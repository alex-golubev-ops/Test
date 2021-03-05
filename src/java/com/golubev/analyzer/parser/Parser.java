package com.golubev.analyzer.parser;

import com.golubev.analyzer.entity.AbstractEntity;

import java.util.List;

public interface Parser {

    List<? extends AbstractEntity> getValue();
}
