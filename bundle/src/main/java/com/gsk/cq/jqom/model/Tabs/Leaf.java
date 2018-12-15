
package com.gsk.cq.jqom.model.Tabs;

import java.util.ArrayList;
import java.util.List;

import com.gsk.cq.jqom.model.Settings;
import com.gsk.cq.jqom.model.SrcBrkPnt;

public class Leaf {
    private String type;
    private List<SrcBrkPnt> srcBrkPnt = new ArrayList<SrcBrkPnt>();
    private String thumbImg;
    private String src;
    private String alt;
    private String caption;
    private Settings settings;
    private String videoTitle;
    private String thumbnail;
    private String format;
    private String posterSrc;
    private String trnScpt;
    private Boolean autoplay;
    private Boolean controls;
    private String height;
    private String width;
    private Boolean loop;
    private Boolean muted;
    private String preload;
    private String playsinline;
    private String content;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<SrcBrkPnt> getSrcBrkPnt() {
        return srcBrkPnt;
    }

    public void setSrcBrkPnt(List<SrcBrkPnt> srcBrkPnt) {
        this.srcBrkPnt = srcBrkPnt;
    }

    public String getThumbImg() {
        return thumbImg;
    }

    public void setThumbImg(String thumbImg) {
        this.thumbImg = thumbImg;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getPosterSrc() {
        return posterSrc;
    }

    public void setPosterSrc(String posterSrc) {
        this.posterSrc = posterSrc;
    }

    public String getTrnScpt() {
        return trnScpt;
    }

    public void setTrnScpt(String trnScpt) {
        this.trnScpt = trnScpt;
    }

    public Settings getSetting() {
        return settings;
    }

    public void setSetting(Settings settings) {
        this.settings = settings;
    }

	public Boolean getAutoplay() {
		return autoplay;
	}

	public void setAutoplay(Boolean autoplay) {
		this.autoplay = autoplay;
	}

	public Boolean getControls() {
		return controls;
	}

	public void setControls(Boolean controls) {
		this.controls = controls;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public Boolean getLoop() {
		return loop;
	}

	public void setLoop(Boolean loop) {
		this.loop = loop;
	}

	public Boolean getMuted() {
		return muted;
	}

	public void setMuted(Boolean muted) {
		this.muted = muted;
	}

	public String getPreload() {
		return preload;
	}

	public void setPreload(String preload) {
		this.preload = preload;
	}

	public String getPlaysinline() {
		return playsinline;
	}

	public void setPlaysinline(String playsinline) {
		this.playsinline = playsinline;
	}
	
	public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
