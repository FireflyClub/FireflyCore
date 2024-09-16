local function main()
    CS.UnityEngine.QualitySettings.vSyncCount = 0

    -- Modified in FireflyCore
    -- local hint1 = CS.UnityEngine.GameObject.Find("/UIRoot/AboveDialog/BetaHintDialog(Clone)/Contents/HintText")
    -- hint1:GetComponent("Text").text = tostring("<color=#FFC0CB>Lethe</color>")
    -- hint1:SetActive(true)

    local hint2 = CS.UnityEngine.GameObject.Find("/UIRoot/AboveDialog/BetaHintDialog(Clone)/Contents/VersionText")
    hint2:GetComponent("Text").text = tostring("<color=#FFC0CB>FireflyCore</color>")
    hint2:SetActive(true)

    -- I like standard ping
    -- local OldPing = CS.UnityEngine.GameObject.Find("/UIRoot/Page/MazeMainPage(Clone)/RightTopArea/NetStatusPanel/NetStatusPanel(Clone)/Connected/Time")
    -- if OldPing then
    --     local NewPing = CS.UnityEngine.GameObject.Instantiate(OldPing, OldPing.transform.parent)
    --     NewPing.name = "Time(Clone)"
    --     NewPing:GetComponent("Text").text = tostring("<color=#FFC0CB>Firefly</color>")
    --     OldPing:SetActive(false)
    --     CS.UnityEngine.Object.Destroy(OldPing)
    -- end
end
main()
