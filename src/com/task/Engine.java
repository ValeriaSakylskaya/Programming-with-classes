package com.task;

import Enums.EngineCondition;

public class Engine {
   private EngineCondition condition;
   Engine()
   {
       this.condition = EngineCondition.DoesNotWork;
   }
   Engine (EngineCondition condition)
   {
       this.condition = condition;
   }

    public EngineCondition getCondition() {
        return condition;
    }

    public void setCondition(EngineCondition condition) {
        this.condition = condition;
    }
}
