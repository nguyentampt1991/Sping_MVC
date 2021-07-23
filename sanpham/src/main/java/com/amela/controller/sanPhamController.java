package com.amela.controller;

import com.amela.model.sanpham;
import com.amela.service.ISanPham;
import com.amela.service.sanphamService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


@Controller
@RequestMapping("/sanpham")
public class sanPhamController {
    private final ISanPham sanphamService = new sanphamService();

    @GetMapping("")
    public String index(Model model) {

        List<sanpham> sanphamList = sanphamService.findAll();
        model.addAttribute("sanpham", sanphamList);
        return "/index";
    }
    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("sanpham", new sanpham());
        return "/create";
    }
    @PostMapping("/save")
    public String save(sanpham sanP) {
        sanP.setId((int) (Math.random() * 10000));
        sanphamService.save(sanP);
        return "redirect:/sanpham";
    }
    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("sanpham", sanphamService.findById(id));
        return "/edit";
    }
    @PostMapping("/update")
    public String update(sanpham sanP) {
        sanphamService.update(sanP.getId(), sanP);
        return "redirect:/sanpham";
    }
    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("sanpham", sanphamService.findById(id));
        return "/delete";
    }
    @PostMapping("/delete")
    public String delete(sanpham sanP, RedirectAttributes redirect) {
        sanphamService.remove(sanP.getId());
        redirect.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/customer";
    }
    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("sanpham", sanphamService.findById(id));
        return "/view";
    }
    @GetMapping("/search")
    public String search(@RequestParam String tukhoa, Model model){

        model.addAttribute("sanpham",sanphamService.search(tukhoa));
        return "/index";
    }
}
