
package com.gsk.cq.jqom.model.Megamenu;

import com.gsk.cq.jqom.model.Errors;

public class Megamenu {
    private Errors errors;
    private Result result;

    public Errors getErrors() {
        return errors;
    }

    public void setErrors(Errors errors) {
        this.errors = errors;
    }

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}
}