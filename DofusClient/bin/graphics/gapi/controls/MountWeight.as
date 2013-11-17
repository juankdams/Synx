// Action script...

// [Initial MovieClip Action of sprite 20906]
#initclip 171
if (!dofus.graphics.gapi.controls.MountWeight)
{
    if (!dofus)
    {
        _global.dofus = new Object();
    } // end if
    if (!dofus.graphics)
    {
        _global.dofus.graphics = new Object();
    } // end if
    if (!dofus.graphics.gapi)
    {
        _global.dofus.graphics.gapi = new Object();
    } // end if
    if (!dofus.graphics.gapi.controls)
    {
        _global.dofus.graphics.gapi.controls = new Object();
    } // end if
    var _loc1 = (_global.dofus.graphics.gapi.controls.MountWeight = function ()
    {
        super();
    }).prototype;
    _loc1.__set__styleName = function (sStyleName)
    {
        this._sStyleName = sStyleName;
        if (this.initialized)
        {
            this._pbWeight.styleName = sStyleName;
        } // end if
        //return (this.styleName());
    };
    _loc1.init = function ()
    {
        super.init(false, dofus.graphics.gapi.controls.MountWeight.CLASS_NAME);
    };
    _loc1.createChildren = function ()
    {
        this.addToQueue({object: this, method: this.addListeners});
        this.addToQueue({object: this, method: this.initData});
    };
    _loc1.addListeners = function ()
    {
        this._pbWeight.addEventListener("over", this);
        this._pbWeight.addEventListener("out", this);
        this.api.datacenter.Player.mount.addEventListener("podsChanged", this);
    };
    _loc1.initData = function ()
    {
        if (this._sStyleName != undefined)
        {
            this._pbWeight.styleName = this._sStyleName;
        } // end if
        this.podsChanged();
    };
    _loc1.podsChanged = function (oEvent)
    {
        var _loc3 = this.api.datacenter.Player.mount.podsMax;
        var _loc4 = this.api.datacenter.Player.mount.pods;
        this._nCurrentWeight = _loc4;
        this._pbWeight.maximum = _loc3;
        this._pbWeight.value = _loc4;
    };
    _loc1.over = function (oEvent)
    {
        switch (oEvent.target)
        {
            case this._pbWeight:
            {
                var _loc3 = oEvent.target.maximum;
                var _loc4 = new ank.utils.ExtendedString(this._nCurrentWeight).addMiddleChar(" ", 3);
                var _loc5 = new ank.utils.ExtendedString(_loc3).addMiddleChar(" ", 3);
                this.gapi.showTooltip(this.api.lang.getText("PLAYER_WEIGHT", [_loc4, _loc5]), oEvent.target, -20);
                break;
            } 
        } // End of switch
    };
    _loc1.out = function (oEvent)
    {
        this.gapi.hideTooltip();
    };
    _loc1.addProperty("styleName", function ()
    {
    }, _loc1.__set__styleName);
    ASSetPropFlags(_loc1, null, 1);
    (_global.dofus.graphics.gapi.controls.MountWeight = function ()
    {
        super();
    }).CLASS_NAME = "MountWeight";
} // end if
#endinitclip
